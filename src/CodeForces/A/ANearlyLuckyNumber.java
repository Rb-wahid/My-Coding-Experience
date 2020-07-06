package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Nearly Lucky Number
 *
 * link : https://codeforces.com/problemset/problem/110/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANearlyLuckyNumber {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.next();
        int lucky = 0;
        for (char ch : str.toCharArray())
            if (ch == '4' || ch == '7')
                lucky++;

            if (lucky == 4 || lucky == 7)
                out.println("YES");
            else
                out.println("NO");
    }
}
