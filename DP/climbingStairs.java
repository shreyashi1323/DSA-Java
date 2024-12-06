package DP;

public class climbingStairs {
    public static int ways(int n, int dp[]){
        if(n==0)return 1;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];

        return dp[n] = ways(n-1, dp)+ ways(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 5;

        // Initialize dp array with -1 (default value)
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;  // Initialize all dp values to -1
        }

        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        System.out.println(ways(n, dp));

    }

    public int waysTabulation(int n , int  dp ){
        if(n ==0) return 0;
        
        return 0;
    }
}
