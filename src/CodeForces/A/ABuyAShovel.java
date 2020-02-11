package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Buy a Shovel
 *
 *link : https://codeforces.com/contest/732/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABuyAShovel {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.nextInt();
        int r = in.nextInt();
        int length = 0;
        int ans = 1;
        String s = String.valueOf(r);
        for (int i = 1; i < 10; i++) {
            String str = String.valueOf(i * k);
            length = str.length();
            if (str.substring(length-1).equals(s) || str.substring(length-1).equals("0") ) {
                ans = i;
                break;
            }
        }
        out.println(ans);
    }
}
