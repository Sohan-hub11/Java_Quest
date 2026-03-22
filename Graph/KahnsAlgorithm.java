//Topological Sorting (using BFS)
//Kahn's Algorithm

package Graph;

import java.util.*;

public class KahnsAlgorithm {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));

    }
    public static void calcInDeg(ArrayList<Edge>[] graph, int[] inDeg){
        for(int i=0; i< graph.length; i++){
            int vertex = i;
            for(int j=0; j<graph[vertex].size(); j++){
                Edge e = graph[vertex].get(j);
                inDeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph){
        int[] inDeg = new int[graph.length];
        calcInDeg(graph, inDeg);

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i< inDeg.length; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }

        //BFS
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " "); //Topological Sort printing

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDeg[e.dest]--;
                if(inDeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        topSort(graph);
    }
}
