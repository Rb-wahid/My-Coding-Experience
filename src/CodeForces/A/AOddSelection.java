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
        int n, x, even, odd;
        while (t-- > 0) {
            n = in.nextInt();
            x = in.nextInt();
            even = 0;
            odd = 0;
            int value = 0;
            for (int i = 0; i < n ; i++) {
                value = in.nextInt();

                if ((value&1) == 0)
                    even++;
                else
                    odd++;
            }
            boolean flag = false;

            for (int i = 1; i <= odd ; i += 2) {
                if (i > x)
                    break;
                if (x-i <= even){
                    flag = true;
                    break;
                }
            }
            out.println(flag? "Yes" : "No");
        }
    }
}
