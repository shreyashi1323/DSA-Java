//package graphs;
//import com.mysql.cj.conf.ConnectionUrlParser;
//
//import java.util.*;
//
//import static graphs.cycleInUndirectedGraph.isCyclic;
//
//public class cycleInUndirectedGraph {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // Number of nodes
//        int m = sc.nextInt(); // Number of edges
//
//        // Initialize adjacency list with size n + 1 to handle 1-based indexing
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i <= n; i++) { // Note: We use `<= n` to handle 1-based indexing
//            adj.add(new ArrayList<>());
//        }
//
//        // Read edges and populate the adjacency list
//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            adj.get(u).add(v);
//            adj.get(v).add(u); // Since it's an undirected graph
//        }
//
//        // Print the adjacency list
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Node " + i + ": ");
//            for (int j : adj.get(i)) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//        // Check for cycle in the graph
//        if (isCyclic(n, adj)) {
//            System.out.println("The graph contains a cycle.");
//        } else {
//            System.out.println("The graph does not contain a cycle.");
//        }
//
//        sc.close();
//    }
//
//    public static boolean  isCyclic(int v, ArrayList<ArrayList<Integer>> adj){
//        boolean vis[]= new boolean[v];
//        for(int i =0;i<v;i++) vis[i] = false;
//        for(int i =0;i<v;i++){
//            if(vis[i]==false){
//                if(checkForCycle(i,v,adj, vis)) return true;
//            }
//        }
//        return false;
//    }
//    public static  boolean checkForCycle(int src, int v, ArrayList<ArrayList<Integer>> adj , boolean[] vis){
//        vis[src]=true;
//        //Queue<Pair> q = new LinkedList<>();
//    }
//}
