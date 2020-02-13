package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Lineland Mail
 *
 * link : https://codeforces.com/contest/567/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ALinelandMail {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int min , max , value ;
        for (int i = 0; i < n ; i++) {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                value = Math.abs(arr[i] - arr[j]);

                if (value > max)
                    max = value;
                if (value < min)
                    min = value;

            }
            out.println(min + " " + max);
        }

    }
}
