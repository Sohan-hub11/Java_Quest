//Graph Traversal in Connected Components.
//Breadth First Search(BFS).

package Graph;

import java.util.*;

public class ConnectComponent_BFS {
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

    public static void createGraph(ArrayList<Edge>[] graph){
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
        graph[5].add(new Edge(5, 5, 1));

        graph[6].add(new Edge(6, 7, 1));

        graph[7].add(new Edge(7, 6, 1));
    }

    public static void bfs(ArrayList<Edge>[] graph){
        //visited array -> to track each node is visited once
        boolean[] visit = new boolean[graph.length];

        for(int i=0; i< graph.length; i++){
            if(!visit[i]) {
                utilBfs(graph, i, visit);
            }
        }
    }
    public static void utilBfs(ArrayList<Edge>[] graph, int src, boolean[] visit){ //O(V+E)
        //Queue for storing nodes
        Queue<Integer> q = new LinkedList<>();

        q.add(src); //source index
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visit[curr]){
                System.out.print(curr + " ");
                visit[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args){

        int V = 8;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        bfs(graph);
    }
}
