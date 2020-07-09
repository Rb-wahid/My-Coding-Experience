package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Sum of Round Numbers
 *
 * link : https://codeforces.com/problemset/problem/1352/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ASumOfRoundNumbers {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int num = in.nextInt();
            StringBuilder sb = new StringBuilder();

            int count = 0;
            int power = 1;
            int value = 0;

            while (num > 0) {
                value = num % 10;

                if (value > 0) {
                    sb.append(value*power).append(" ");
                    count++;
                }
                num /= 10;
                power *= 10;
            }

            out.println(count);
            out.println(sb.toString());
        }
    }
}
