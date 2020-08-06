package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Interesting drink
 *
 * link : https://codeforces.com/problemset/problem/706/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.TreeSet;

public class BInterestingDrink {
    int binarySearch(int[]arr, int x) {
        int l = 0;
        int r = arr.length;
        int mid;

        while (l < r) {
            mid = (l+r) >>1;

            if (arr[mid] <= x){
               l = mid+1;
            }
            else {
                r = mid;
            }
        }
        return l;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int q = in.nextInt();
        Arrays.sort(arr);
        while (q-->0) {
            int m = in.nextInt();
            out.println(binarySearch(arr, m));
        }
    }
}
