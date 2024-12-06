package DP;

import java.util.Arrays;

public class fibonnacci {
    public static int fib(int n, int[]dp){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]= fib(n-1,dp)+ fib(n-2,dp);
    }
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8
        int n = 8;
        int dp [] = new int [n];
        Arrays.fill(dp, -1);
        System.out.println(fib(n,dp));
    }
}
