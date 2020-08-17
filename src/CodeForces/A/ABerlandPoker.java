package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Berland Poker
 *
 * link : https://codeforces.com/problemset/problem/1359/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABerlandPoker {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0){
            int n = in.nextInt();
            int joker = in.nextInt();
            int player = in.nextInt();

            int per = n/player;
            if (per >= joker)
                out.println(joker);
            else {
                int otherMax = (joker-per)/ (player-1);

                if ((joker-per)%(player-1) != 0)
                    otherMax++;

                out.println(per - otherMax);
            }
        }
    }
}
