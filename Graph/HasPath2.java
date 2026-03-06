//Has Path Problem.
//Count number of paths from source to destination.

package Graph;

import java.util.ArrayList;

public class HasPath2 {
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

    //public static int count;
    public static int countPath(ArrayList<Edge>[] graph, int curr, boolean[] visit, int dest){ //O(V+E)

        //visit curr
        if(curr == dest){
            return 1;
        }
        visit[curr] = true;
        int count = 0;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                count+= countPath(graph, e.dest, visit, dest);
            }

        }

        visit[curr] = false; //backtracking
        return count;
    }
    public static void main(String[] args){

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.println(countPath(graph, 0, new boolean[V], 5));
    }
}
