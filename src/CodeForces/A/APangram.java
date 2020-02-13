package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Pangram
 *
 * link : https://codeforces.com/contest/520/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APangram {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int length = in.nextInt();
        String str = in.readLine();

        if (length < 26)
            out.println("NO");
        else {
            str = str.replaceAll("[^a-z,A-Z]", "");
            if (str.length() < 26)
                out.println("NO");
            else
                out.println("YES");
        }
    }
}
