package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Football
 *
 * link : https://codeforces.com/contest/43/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFootball {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String str1 = "", s, str2 = "";
        int a = 0, b = 0;

        if (n == 1)
            out.println(in.readLine());
        else{
            str1 = in.readLine();
            for (int i = 1; i < n; i++) {
                s = in.readLine();
                if (s.equals(str1)) {
                    a++;
                }
                else {
                    str2 = s;
                    b++;
                }
            }
        }

        out.println(Math.max(a, b) == a ? str1 : str2);
    }
}
