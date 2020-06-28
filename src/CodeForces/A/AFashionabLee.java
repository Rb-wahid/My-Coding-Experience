package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. FashionabLee
 *
 * link : https://codeforces.com/problemset/problem/1369/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFashionabLee {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long n = in.nextLong();

            if (n % 4 == 0)
                out.println("YES");
            else
                out.println("NO");


        }
    }
}
