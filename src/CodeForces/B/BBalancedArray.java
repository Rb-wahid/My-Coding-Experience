package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Balanced Array
 *
 * link : https://codeforces.com/problemset/problem/1343/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BBalancedArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        StringBuilder sb ;
        while (t-->0) {
            sb = new StringBuilder();
            int num = in.nextInt();

            if (num % 4 == 0) {
                sb.append("YES").append("\n");

                for (int i = 2; i <= num ; i += 2) {
                    sb.append(i + " ");
                }

                for (int i = 1; i < num-1 ; i += 2) {
                      sb.append(i + " ");
                }
                sb.append((num-1)+ (num>>1));
            }

            else
                sb.append("NO");
            out.println(sb);
        }
    }
}
