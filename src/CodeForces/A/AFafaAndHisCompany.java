package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Fafa and his Company
 *
 * link : http://codeforces.com/problemset/problem/935/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFafaAndHisCompany {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int count = 0;

        for (int i = 1; i <= n/2 ; i++) {
            if (n % i == 0)
                count++;
        }

        out.println(count);
    }
}
