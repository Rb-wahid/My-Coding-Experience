package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Flipping Game
 *
 * link : https://codeforces.com/problemset/problem/327/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFlippingGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int value = 0;
        int one = 0;
        int zero = 0;
        int maxZero = -1;

        for (int i = 0; i < n; i++) {
            value = in.nextInt();
            if (value == 1){
                one++;
                if (zero > 0)
                zero--;
            }
           else  {
                zero++;
                maxZero = Math.max(maxZero, zero);
            }
        }
        out.println(one+maxZero);
    }
}
