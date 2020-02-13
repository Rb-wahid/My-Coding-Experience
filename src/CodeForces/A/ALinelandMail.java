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
        int min , max  ;

        min = Math.abs(arr[1] - arr[0]);
        max = Math.abs(arr[n-1] - arr[0]);

        out.println(min + " " + max);

        for (int i = 1; i < n-1; i++) {
            min = Math.min(Math.abs(arr[i] - arr[i-1]), Math.abs(arr[i] - arr[i+1]));
            max = Math.max(Math.abs(arr[i] - arr[0]), Math.abs(arr[i] - arr[n-1]));

            out.println(min + " " + max);
        }
        min = Math.abs(arr[n-1] - arr[n-2]);
        max = Math.abs(arr[n-1] - arr[0]);

        out.println(min + " " + max);

    }
}
