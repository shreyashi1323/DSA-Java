package graphs;
import java.util.*;
public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        List<Integer> bfsResult = bfsOfGraph(n, adj);
        System.out.println("BFS of the graph: " + bfsResult);

    }

//    static Map<Integer,List<Integer>> adjListHashMap(int n . int e , int [][]arr){
//        Map <Integer ,List<Integer>> res = new HashMap<>();
//        for(int i =0;i<e;i++){
//            int a = arr[i][0];
//            int b = arr[i][1];
//
//            if(res.containsKey(a)){
//                res.get(a).add(b);
//                if(res.containsKey(b)){
//                    res.get(b).add(a);
//                }
//            }
//            else{
//                List<Integer>temp =new ArrayList<>();
//                temp.add(b);
//                res.put(a, temp);
//
//                //extra step for undirected graph
//                temp = new ArrayList<>();
//                temp.add(a);
//                res.put(b, temp);
//            }
//        }
//        return res;
//    }


    private static List<Integer> bfsOfGraph(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[n+1];
        Queue<Integer>q= new LinkedList<>();
        List<Integer> ans= new ArrayList<>(0);
        if(n>0){
            vis[1]=true;
            q.offer(1);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);

            for(int a : adj.get(node)){
                if(!vis[a]){
                    vis[a]= true;
                    q.offer(a);
                }
            }
        }
        return ans;
    }
}
