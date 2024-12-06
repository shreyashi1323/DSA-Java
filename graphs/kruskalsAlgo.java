package graphs;
import java.util.*;

public class kruskalsAlgo {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        // Constructor
        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        // Comparator to sort edges by weight
        @Override
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    static class DisjointSet {
        private int[] parent, rank;

        // Constructor
        public DisjointSet(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i; // Initially, each node is its own parent
                rank[i] = 0;   // Rank starts at 0
            }
        }

        // Find with path compression
        public int find(int node) {
            if (node != parent[node]) {
                parent[node] = find(parent[node]);
            }
            return parent[node];
        }

        // Union by rank
        public void union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);

            if (rootU != rootV) {
                if (rank[rootU] < rank[rootV]) {
                    parent[rootU] = rootV;
                } else if (rank[rootV] < rank[rootU]) {
                    parent[rootV] = rootU;
                } else {
                    parent[rootV] = rootU;
                    rank[rootU]++;
                }
            }
        }
    }

    public static void kruskalMST(int vertices, List<Edge> edges) {
        // Step 1: Sort edges by weight
        Collections.sort(edges);

        // Step 2: Initialize Disjoint Set
        DisjointSet ds = new DisjointSet(vertices);

        // Step 3: Pick edges to form MST
        List<Edge> mst = new ArrayList<>();
        int mstWeight = 0;

        for (Edge edge : edges) {
            if (ds.find(edge.src) != ds.find(edge.dest)) {
                // If adding this edge doesn't form a cycle
                mst.add(edge);
                mstWeight += edge.weight;
                ds.union(edge.src, edge.dest);
            }
        }

        // Step 4: Print MST
        System.out.println("Edges in the MST:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
        }
        System.out.println("Total weight of MST: " + mstWeight);
    }

    public static void main(String[] args) {
        int vertices = 6; // Number of vertices

        // List of edges in the graph (src, dest, weight)
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(1, 2, 4));
        edges.add(new Edge(1, 3, 4));
        edges.add(new Edge(2, 3, 2));
        edges.add(new Edge(2, 4, 6));
        edges.add(new Edge(3, 4, 8));
        edges.add(new Edge(4, 5, 9));
        edges.add(new Edge(5, 6, 10));
        edges.add(new Edge(4, 6, 7));

        // Run Kruskal's Algorithm
        kruskalMST(vertices, edges);
    }
}
