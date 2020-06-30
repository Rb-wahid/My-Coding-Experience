package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Array with Odd Sum
 *
 * link : https://codeforces.com/problemset/problem/1296/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AArrayWithOddSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int n = in.nextInt();
            int sum = 0;
            int even = 0;
            int odd = 0;
            int value;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <n ; i++) {
                value = in.nextInt();
                if ((value&1) == 1)
                    odd++;
                else
                    even++;
                sum += value;
            }
            if ((sum & 1) == 0) {
                if (odd != 0 && even != 0)
                    sb.append("YES");
                else
                    sb.append("NO");
            }
            else
                sb.append("YES");

            out.println(sb);
        }
    }
}
