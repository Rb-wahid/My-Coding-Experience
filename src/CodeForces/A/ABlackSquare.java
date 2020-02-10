package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Black Square
 *
 *link : https://codeforces.com/contest/431/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABlackSquare {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a1 = in.nextInt(), a2 = in.nextInt(), a3 = in.nextInt(), a4 = in.nextInt();
        String str = in.nextString();

        int calories = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '1')
                calories += a1;
            if (ch == '2')
                calories += a2;
            if (ch == '3')
                calories += a3;
            if (ch == '4')
                calories += a4;
        }

        out.println(calories);
    }
}
