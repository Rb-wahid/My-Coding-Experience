package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Next Round
 *
 * link : http://codeforces.com/problemset/problem/158/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANextRound {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        int same = 0;

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            if (value > k)
                count++;
            if (value == k)
                same++;
        }
        if(count != 0)
        out.println(count);
        else out.println(same);
    }
}
