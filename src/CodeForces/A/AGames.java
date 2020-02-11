package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Games
 *
 *link : https://codeforces.com/contest/268/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGames {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] home = new int[n];
        int[] guest = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            home[i] = in.nextInt();
            guest[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (home[i] == guest[j])
                    ans++;
            }
        }

        out.println(ans);
    }
}
