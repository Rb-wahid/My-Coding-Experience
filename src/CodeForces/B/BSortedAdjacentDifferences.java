package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Sorted Adjacent Differences
 *
 * link : https://codeforces.com/problemset/problem/1339/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BSortedAdjacentDifferences {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n ; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);

            if ((arr.length&1) == 0){
                int midleft = (arr.length/2) - 1;
                int midRight = midleft+1;
                while (midleft>= 0){
                    sb.append(arr[midleft]).append(" ").append(arr[midRight]).append(" ");
                    midleft--;
                    midRight++;
                }
            }
            else {
                int midleft =(int) Math.round(arr.length/2.0) - 1;
                int midRight = midleft+1;
                while (midleft>0){
                    sb.append(arr[midleft]).append(" ").append(arr[midRight]).append(" ");
                    midleft--;
                    midRight++;
                }
                sb.append(arr[0]);
            }
           out.println(sb);
        }
    }
}
