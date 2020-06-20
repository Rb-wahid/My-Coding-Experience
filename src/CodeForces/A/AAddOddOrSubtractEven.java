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
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();
        while (t-->0) {
            StringBuilder stringBuilder = new StringBuilder();
            int a = in.nextInt();
            int b = in.nextInt();

            if (a != b){
                if ((b&1) == 1)
                    stringBuilder.append(1);
                else
                    stringBuilder.append(2);
            }
            else
                stringBuilder.append(0);

            out.println(stringBuilder.toString());
        }
    }
}
