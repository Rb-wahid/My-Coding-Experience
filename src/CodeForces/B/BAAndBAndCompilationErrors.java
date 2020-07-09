package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. A and B and Compilation Errors
 *
 * link : https://codeforces.com/problemset/problem/519/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class BAAndBAndCompilationErrors {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] first = new int[n];
        int[] second = new int[n-1];
        int[] third = new int[n-2];

        long a = 0;
        long b = 0;
        long c = 0;

        for (int i = 0; i < n ; i++) {
            first[i] = in.nextInt();
            a += first[i];
        }
        for (int i = 0; i < n-1 ; i++) {
            second[i] = in.nextInt();
            b += second[i];
        }
        for (int i = 0; i < n -2; i++) {
            third[i] = in.nextInt();
            c += third[i];
        }

        out.println(a -b);
        out.println(b-c);
    }
}
