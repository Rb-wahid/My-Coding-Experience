package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Two Buttons
 *
 * link : https://codeforces.com/problemset/problem/520/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BTwoButtons {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        while (n != m){
            count++;
            if (n < m && n * 2 <= m) {
                n *= 2;
            }
            else {
                --n;
            }
        }
        out.println(count);
    }
}
