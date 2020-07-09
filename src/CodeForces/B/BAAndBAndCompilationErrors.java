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

        for (int i = 0; i < n ; i++) {
            first[i] = in.nextInt();
        }
        for (int i = 0; i < n-1 ; i++) {
            second[i] = in.nextInt();
        }
        for (int i = 0; i < n -2; i++) {
            third[i] = in.nextInt();
        }

        Arrays.sort(first);
        Arrays.sort(second);
        Arrays.sort(third);

        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i < n-1; i++) {
            if (first[i] != second[i]){
                out.println(first[i]);
                flag1 = true;
                break;
            }
        }
        if (!flag1)
            out.println(first[n]);

        for (int i = 0; i < n-2; i++) {
            if (second[i] != third[i]){
                out.println(second[i]);
                flag2 = true;
                break;
            }
        }

        if (!flag2)
            out.println(second[n-2]);
    }
}
