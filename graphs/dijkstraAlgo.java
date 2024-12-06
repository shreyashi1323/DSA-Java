package graphs;

import java.util.*;

// Main class
public class dijkstraAlgo {

    // Nested static class for Pair
    static class Pair {
        int node; // The node connected
        int weight; // The weight of the edge

        // Constructor for Pair
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        // Override toString for debugging
        @Override
        public String toString() {
            return "(" + node + ", " + weight + ")";
        }
    }

    public static void main(String[] args) {
        int n = 7; // Number of nodes
        int e = 11; // Number of edges
        int[][] mat = {
                {0, 1, 10}, {0, 2, 1}, {1, 2, 2}, {2, 5, 11},
                {2, 6, 6}, {6, 5, 7}, {6, 4, 9}, {5, 3, 12},
                {4, 3, 8}, {1, 3, 5}, {1, 5, 3}
        };

        // Create adjacency list
        List<List<Pair>> adj = adjList(n, e, mat);

        // Print adjacency list
        for (List<Pair> ls : adj) {
            System.out.println(ls);
        }

        // Run Dijkstra's algorithm
        int src = 0; // Source node
        Dijkstra(n, adj, src);
    }

    // Function to create adjacency list
    static List<List<Pair>> adjList(int n, int e, int[][] mat) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            int a = mat[i][0], b = mat[i][1], w = mat[i][2];
            adj.get(a).add(new Pair(b, w));
            adj.get(b).add(new Pair(a, w)); // Undirected graph
        }

        return adj;
    }

    // Dijkstra's algorithm implementation
    static void Dijkstra(int n, List<List<Pair>> adj, int src) {
        boolean[] vis = new boolean[n]; // To track visited nodes
        int[] dis = new int[n]; // To store distances
        Arrays.fill(dis, Integer.MAX_VALUE); // Initialize distances to infinity
        dis[src] = 0; // Distance to the source is 0

        // Min-Heap (Priority Queue) to process nodes by shortest distance
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        pq.offer(new Pair(src, 0)); // Start with the source

        while (!pq.isEmpty()) {
            Pair temp = pq.poll();
            int a = temp.node; // Current node

            // If the node is already visited, skip it
            if (vis[a]) continue;

            // Mark as visited
            vis[a] = true;

            // Process neighbors
            for (Pair p : adj.get(a)) {
                int b = p.node; // Neighbor node
                int w = p.weight; // Edge weight

                // Relaxation step
                if (dis[a] + w < dis[b]) {
                    dis[b] = dis[a] + w;
                    pq.offer(new Pair(b, dis[b]));
                }
            }
        }

        // Print the shortest distances from the source
        for (int i = 0; i < n; i++) {
            System.out.println("Shortest distance from src " + src + " to dest " + i + " is " + dis[i]);
        }
    }
}
