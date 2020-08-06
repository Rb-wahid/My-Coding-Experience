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

public class BInterestingDrink {
    int binarySearch(int[]arr, int x) {
        int l = 0;
        int r = arr.length-1;
        int mid;
        int index = -1;

        while (l <= r) {
            mid = (l+r) >>1;

            if (arr[mid] == x){
                index = mid;
                break;
            }
            else if (arr[mid] < x){
                l = mid+1;
                index = (l+r)>>1;
            }
            else {
                r = mid-1;
                index = (l+r)>>1;
            }
        }
        return index;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int q = in.nextInt();

        while (q-->0) {
            int m = in.nextInt();
            out.println(binarySearch(arr, m)+1);
        }
    }
}
