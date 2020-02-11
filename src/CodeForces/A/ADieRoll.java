package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Die Roll
 *
 *link : https://codeforces.com/contest/9/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADieRoll {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int y = in.nextInt();
        int w = in.nextInt();
        int D ;
        if (y > w)
            D = (6-y) + 1;
        else
            D = (6-w) + 1;
        if(D == 6)
            out.println(1 + "/" + 1);
        else if (D > 0 ) {
            for (int i = 2; i <= 6; i++) {
                if (D % i == 0 && 6 % i == 0)
                    out.println(D / i + "/" + (6 / i));
            }
        }
        else
            out.println(0 + "/" + 1);
    }
}
