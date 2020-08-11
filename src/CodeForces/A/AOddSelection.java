package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Odd Selection
 *
 * link : https://codeforces.com/problemset/problem/1363/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AOddSelection {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        int n, x, odd;
        int[] arr;
        while (t-- > 0) {
            n = in.nextInt();
            x = in.nextInt();
            odd = 0;
            for (int i = 0; i < n; i++) {
                if ((in.nextInt() & 1) == 1)
                    odd++;
            }
            if ((odd & 1) == 1)
                out.println("Yes");
            else
                out.println("No");
        }
    }
}
