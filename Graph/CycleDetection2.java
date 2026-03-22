//Cycle Detection (using DFS) -> Directed

package Graph;

import java.util.*;

public class CycleDetection2 {
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

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
        //graph[3].add(new Edge(3, 2));

    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stackVis = new boolean[graph.length];

        for(int i=0; i< graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stackVis)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stackVis){
        vis[curr] = true;
        stackVis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stackVis[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stackVis)){
                return true;
            }
        }
        stackVis[curr] = false;

        return false;
    }
    public static void main(String[] args){
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
