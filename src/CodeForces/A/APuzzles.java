package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Puzzles
 *
 * link : https://codeforces.com/problemset/problem/337/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class APuzzles {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i <m ; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= m-n ; i++) {
            int value = arr[n-1+i] - arr[i];
            if (min > value)
                min = value;
        }

        out.println(min);
    }
}
