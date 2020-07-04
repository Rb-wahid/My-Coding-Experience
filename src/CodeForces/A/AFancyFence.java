package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Fancy Fence
 *
 * link : http://codeforces.com/problemset/problem/270/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFancyFence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();

            if (360 % (180-n) == 0 )
                out.println("YES");
            else
                out.println("NO");

        }
    }
}
