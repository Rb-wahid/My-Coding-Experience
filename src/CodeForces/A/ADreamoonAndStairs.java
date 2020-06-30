package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Dreamoon and Stairs
 *
 * link : https://codeforces.com/problemset/problem/476/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADreamoonAndStairs {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0;
        if ( n < m)
            ans = -1;
        else {
            if ((n&1) == 0)
                ans = n >> 1;
            else
                ans = (n>>1) +1;
            while (ans % m != 0)
                ans++;
        }

        out.println(ans);
    }
}
