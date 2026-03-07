//Graph Traversal of Connected Components.
//Depth First Search(BFS).

package Graph;

import java.util.ArrayList;

public class ConnectedComponents_DFS {
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

        graph[6].add(new Edge(6, 7, 1));

        graph[7].add(new Edge(7, 6, 1));
    }

    public static void dfs(ArrayList<Edge>[] graph){
        //visited array -> to track each node is visited once
        boolean[] visit = new boolean[graph.length];

        for(int i=0; i< graph.length; i++){
                utildfs(graph, i, visit);
        }
    }
    public static void utildfs(ArrayList<Edge>[] graph, int curr, boolean[] visit){

        //visit curr
        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                utildfs(graph, e.dest, visit);
            }

        }
    }
    public static void main(String[] args){

        int V = 8;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        //int src = graph[0].get(0).src;
        dfs(graph);
    }
}
