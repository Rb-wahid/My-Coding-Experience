package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Kana and Dragon Quest game
 *
 * link : https://codeforces.com/problemset/problem/1337/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BKanaAndDragonQuestGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int x = in.nextInt();
            int n = in.nextInt();
            int m = in.nextInt();



            while (n != 0 && x / 2 + 10 < x) {
                n--;
                x = x /2 + 10;
            }
            if (x <= m*10)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
