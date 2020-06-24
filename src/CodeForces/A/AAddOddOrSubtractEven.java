package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Add Odd or Subtract Even
 *
 * link : https://codeforces.com/problemset/problem/1311/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AAddOddOrSubtractEven {

    int solve(int a ,int b) {
        if (a > b) {
            if (((a - b)&1) == 0)
                return 1;
            else
                return 2;
        }
        else {
            if (((b - a)&1) == 1)
                return 1;
            else
                return 2;
        }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();
        while (t-->0) {
            StringBuilder stringBuilder = new StringBuilder();
            int a = in.nextInt();
            int b = in.nextInt();

            if (a != b){
                stringBuilder.append(solve(a, b));
            }
            else
                stringBuilder.append(0);

            out.println(stringBuilder.toString());
        }
    }
}
