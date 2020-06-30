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
        int ans = -1;
        for (int i = (n/2)+1; i <= n ; i++) {
            if (i % m == 0){
                ans = i;
                break;
            }

        }
        out.println(ans);
    }
}
