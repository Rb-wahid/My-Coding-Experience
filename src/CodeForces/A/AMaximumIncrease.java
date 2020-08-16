package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Maximum Increase
 *
 * link : https://codeforces.com/problemset/problem/702/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class AMaximumIncrease {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long[] arr2 = new long[n];
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextLong();
        }
        int count = 1;
        long max = Integer.MIN_VALUE;
        if (n > 1) {
        for (int j = 0; j < n - 1; j++) {
            if (arr2[j] < arr2[j + 1]) {
                count++;
                arr[j + 1] = count;

            } else {
                arr[j] = count;
                count = 1;
            }
        }
        if (arr2[n - 2] < arr2[n - 1])
            arr[n - 1] = arr[n - 2] + 1;
        else
            arr[n - 1] = 1;

        for (long k : arr) {
            max = Math.max(max, k);
        }

            out.println(max);
    }
        else
            out.println(1);


    }
}
