package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Calculating Function
 *
 * link : http://codeforces.com/contest/486/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACalculatingFunction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int ans = 0;

        for (int i = 0; i <= n ; i += 2)
            ans += i;

        for (int i = 1; i <= n ; i += 2)
            ans -= i;

        out.println(ans);
    }
}
