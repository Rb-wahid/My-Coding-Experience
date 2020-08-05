package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Restoring Three Numbers
 *
 * link : https://codeforces.com/problemset/problem/1154/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ARestoringThreeNumbers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long[] arr = new long[4];

        for (int i = 0; i <4 ; i++) {
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);

        out.println((arr[3]-arr[0]) + " " + (arr[3]-arr[1]) + " " + (arr[3]-arr[2]));
    }
}
