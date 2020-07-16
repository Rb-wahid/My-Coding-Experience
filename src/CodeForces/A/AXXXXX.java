package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. XXXXX
 *
 * link : https://codeforces.com/problemset/problem/1364/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AXXXXX {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int sum = 0, l = -1, r = 0;
            int n = in.nextInt();
            int x = in.nextInt();

            for (int i = 0; i <n ; i++) {
                int a = in.nextInt();
                if (a%x != 0){
                    if (l == -1)
                        l = i;
                    r = i;
                }
                sum += a;
            }
            if (sum%x != 0)
                out.println(n);
            else if (l == -1)
                out.println(-1);
            else
                out.println(n - Math.min(l+1, n-r));
        }
    }
}
