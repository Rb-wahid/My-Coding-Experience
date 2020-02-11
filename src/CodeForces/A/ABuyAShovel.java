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

        for (int i = 1; i < 10; i++) {

            if ((k * i) % 10 == r || (k * i) % 10 == 0 ) {
                out.println(i);
                break;
            }
        }
    }
}
