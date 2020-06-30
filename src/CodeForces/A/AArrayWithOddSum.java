package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Array with Odd Sum
 *
 * link : https://codeforces.com/problemset/problem/1296/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AArrayWithOddSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int n = in.nextInt();
            int sum = 0;
            for (int i = 0; i <n ; i++) {
                sum += in.nextInt();
            }
            if ((sum & 1) == 0)
                out.println("NO");
            else
                out.println("YES");
        }
    }
}
