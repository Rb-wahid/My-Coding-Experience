package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Mahmoud and Longest Uncommon Subsequence
 *
 * link : https://codeforces.com/contest/766/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMahmoudAndLongestUncommonSubsequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str1 = in.readLine();
        String str2 = in.readLine();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int max = Math.max(ch1.length, ch2.length);
        boolean flag = true;

        if (ch1.length != ch2.length)
            out.println(max);
        else
        {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                out.println("-1");
            else
                out.println(max);
        }
    }
}
