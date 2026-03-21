//Cycle Detection (using DFS) -> Undirected

package Graph;
import java.util.*;
public class CycleDetection1 {
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

        graph[0].add(new Edge(0, 1));
        //graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        //graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 2));
    }

    public static boolean detectCycleDFS(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                if(utilDetectCycleDFS(graph, vis, i, -1)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean utilDetectCycleDFS(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            //Case 3: if vis[neighbour] is false THEN call DFS for neighbour
                        //Check for cycle -> return true
            if(!vis[e.dest]){
                if(utilDetectCycleDFS(graph, vis, e.dest, curr)){
                    return true;
                }
            }

            //Case 1: vis[neighbour] is true && it is not the parent THEN return true
            else if (vis[e.dest] && e.dest != parent) {
                return true;
            }

            //Case 2: do nothing -- vis[neighbour] is true && also parent -- Continue
        }

        return false;
    }
    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        System.out.println(detectCycleDFS(graph));
    }
}
