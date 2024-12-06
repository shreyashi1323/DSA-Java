package graphs;
import java.util.*;

class Pair {
    int node;
    int distance;

    public Pair(int distance, int node) {
        this.node = node;
        this.distance = distance;
    }
}

public class primsAlgo {

    // Function to find the sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        int[] vis = new int[V];
        pq.add(new Pair(0, 0)); // Start from node 0
        int sum = 0;

        while (!pq.isEmpty()) {
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.poll(); // Remove the node from the priority queue

            if (vis[node] == 1) continue; // If the node is already in MST, skip it

            // Add weight to MST sum
            vis[node] = 1;
            sum += wt;

            // Traverse through adjacent nodes
            for (ArrayList<Integer> neighbor : adj.get(node)) {
                int adjNode = neighbor.get(0);
                int edW = neighbor.get(1);

                if (vis[adjNode] == 0) { // If the adjacent node is not visited
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        int[][] edges = {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            // Add edges in both directions
            ArrayList<Integer> tmp1 = new ArrayList<>();
            ArrayList<Integer> tmp2 = new ArrayList<>();
            tmp1.add(v);
            tmp1.add(w);
            tmp2.add(u);
            tmp2.add(w);

            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }

        primsAlgo obj = new primsAlgo();
        int sum = obj.spanningTree(V, adj);
        System.out.println("The sum of all the edge weights: " + sum);
    }
}
