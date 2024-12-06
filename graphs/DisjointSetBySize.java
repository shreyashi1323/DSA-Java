package graphs;

import java.util.ArrayList;
import java.util.List;

public class DisjointSetBySize {
    static class DisjointSet {
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();

        // Constructor initializes the parent and size arrays
        public DisjointSet(int n) {
            for (int i = 0; i <= n; i++) { // Using 0-based or 1-based indexing, so <= n
                parent.add(i); // Initially, each node is its own parent
                size.add(1);   // Initial size of each set is 1
            }
        }

        // Find the ultimate parent of a node (with path compression)
        public int findUpar(int node) {
            if (node == parent.get(node)) return node;
            int ulp = findUpar(parent.get(node)); // Recursively find ultimate parent
            parent.set(node, ulp);               // Path compression
            return ulp;
        }

        // Union two sets by size
        public void unionBySize(int u, int v) {
            int ulp_u = findUpar(u); // Find ultimate parent of u
            int ulp_v = findUpar(v); // Find ultimate parent of v

            if (ulp_u == ulp_v) return; // Already in the same set

            // Attach smaller set to the larger set
            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v)); // Update size of ulp_v
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v)); // Update size of ulp_u
            }
        }
    }

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);

        ds.unionBySize(1, 2); // Union of 1 and 2
        ds.unionBySize(2, 3); // Union of 2 and 3
        ds.unionBySize(4, 5); // Union of 4 and 5
        ds.unionBySize(6, 7); // Union of 6 and 7
        ds.unionBySize(5, 6); // Union of 5 and 6

        // Check if 3 and 7 belong to the same set
        if (ds.findUpar(3) == ds.findUpar(7)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        // Union of 3 and 7
        ds.unionBySize(3, 7);

        // Check again if 3 and 7 belong to the same set
        if (ds.findUpar(3) == ds.findUpar(7)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
