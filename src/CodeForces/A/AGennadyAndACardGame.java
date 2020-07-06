package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Gennady and a Card Game
 *
 * link : https://codeforces.com/problemset/problem/1097/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGennadyAndACardGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String onTAble = in.next();
        String a = String.valueOf(onTAble.charAt(0));
        String b = String.valueOf(onTAble.charAt(1));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb.append(in.next());
        }
        String str = sb.toString().replaceAll(a, "").replaceAll(b, "");

        if (sb.toString().equals(str))
            out.println("NO");
        else
            out.println("YES");


    }
}
