package graphs;
import java.util.*;

public class KahnAlgo {
    public static void main(String[] args) {
        int n = 6; // Number of nodes
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        // Add edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        // Call Kahn's Algorithm
        List<Integer> topoSort = kahnAlgorithm(n, adj);
        System.out.println("Topological Order: " + topoSort);
    }

    static List<Integer> kahnAlgorithm(int n, List<List<Integer>> adj) {
        List<Integer> topoSort = new ArrayList<>();
        int[] indegree = new int[n];

        // Calculate indegree for each node
        for (int i = 0; i < n; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        // Initialize the queue with nodes having indegree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Process nodes with indegree 0
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoSort.add(node);

            // Reduce indegree of neighbors
            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        if (topoSort.size() != n) {
            throw new IllegalStateException("Graph contains a cycle, topological sort not possible");
        }

        return topoSort;
    }
}
