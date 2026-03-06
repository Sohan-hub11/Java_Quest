//Has Path Problem.
//For give src and destination, tell if a path exist from src to destination or not

package Graph;

import java.util.*;

public class HasPath1 {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){ //O(V+E)
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int curr, boolean[] visit, int dest){ //O(V+E)

        //visit curr
        if(curr == dest){
            return true;
        }
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest] && hasPath(graph, e.dest, visit, dest)){
                return true;
            }

        }

        return false;
    }
    public static void main(String[] args){

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.println(hasPath(graph, 0, new boolean[V], 5));
    }
}
