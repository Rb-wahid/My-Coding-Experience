package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Free Ice Cream
 *
 * link : https://codeforces.com/problemset/problem/686/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFreeIceCream {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        long have = in.nextLong();
        int countS = 0;
        for (int i = 0; i < t; i++) {
            char ch = in.nextCharacter();
            int n = in.nextInt();
            if (ch == '+'){
                have += n;
            }
            else {

                if (have - n < 0)
                    countS++;
                else
                    have -= n;

            }
        }

        out.println(have + " " + countS);
    }
}
