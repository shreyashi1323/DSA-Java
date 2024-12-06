package graphs;
import java.util.*;
public class FirstGraph {
    public static void main(String[] args) {
        // using adjancy matrix storing elemnts
/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int adj[][]= new int [n+1][n+1];
        for(int i =0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }*/

        //storing elemnts using adjancy list
        int n=3, m=3;
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>adj= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // Since it's an undirected graph
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
