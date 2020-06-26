package CodeForces.C;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: C. A and B and Team Training
 *
 * link : https://codeforces.com/problemset/problem/519/C
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class CAAndBAndTeamTraining {

    int solve(int n, int m){
        int count = 0;

        while (n > 0 && m > 0){
            if (n == 1 && m == 1)
                break;
            if (n > m) {
                n -= 2;
                m -= 1;
            }
            else {
                --n;
                m -= 2;
            }
            count++;
        }

        return count;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        out.println(solve(n, m));

    }
}
