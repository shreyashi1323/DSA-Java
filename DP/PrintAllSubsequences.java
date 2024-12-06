package DP;

import java.util.ArrayList;

public class PrintAllSubsequences {
    public static void printF(int ind, ArrayList<Integer> ds, int arr[], int n) {
        // Base case: if we've considered all elements
        if (ind == n) {
            // Print the current subsequence
            if (ds.size() == 0) {
                System.out.print(" {} ");
            } else {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
            }
            System.out.println();
            return; // Return to avoid further processing
        }

        // Pick the current element
        ds.add(arr[ind]);
        printF(ind + 1, ds, arr, n);
        // Backtrack
        ds.remove(ds.size() - 1);

        // Do not pick the current element
        printF(ind + 1, ds, arr, n);
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        printF(0, ds, arr, n);
    }
}
