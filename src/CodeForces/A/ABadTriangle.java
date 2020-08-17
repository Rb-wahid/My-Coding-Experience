package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Bad Triangle
 *
 * link : https://codeforces.com/problemset/problem/1398/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Set;
import java.util.TreeSet;

public class ABadTriangle {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int n =in.nextInt();
            int[] arr = new  int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            if ((arr[0]+arr[1]) < arr[n-1])
                out.println(1 + " " + 2 + " " + n );
            else
                out.println(-1);
        }

    }
}
