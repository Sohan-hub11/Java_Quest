//Check whether any Path present from Source to Target or not.

package Graph;

import java.util.ArrayList;

public class AllPath1 {
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
    public static boolean findPath(ArrayList<Edge>[] graph, int src, int dest){
        if(src == dest){
            return true;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            return findPath(graph, e.dest, dest);
        }

        return false;
    }

    public static void main(String[] args){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        //src = 5, dest = 1;
        System.out.println(findPath(graph, 5, 1));
    }
}
