package DP;

import java.util.ArrayList;

public class PrintSubSeqWithSumK {
    public static void printS(int ind, ArrayList<Integer> ds, int s, int sum, int arr[], int n) {
        // Base case: when we reach the end of the array
        if (ind == n) {
            // Check if the current sum matches the target sum
            if (s == sum) {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println(); // Print a new line after the subsequence
            }
            return;
        }

        // Include the current element
        ds.add(arr[ind]);
        printS(ind + 1, ds, s + arr[ind], sum, arr, n);

        // Exclude the current element (backtrack)
        ds.remove(ds.size() - 1);
        printS(ind + 1, ds, s, sum, arr, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int n = arr.length;
        int sum = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        printS(0, ds, 0, sum, arr, n);
    }
}
