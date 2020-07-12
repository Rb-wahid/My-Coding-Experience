package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Wrong Subtraction
 *
 * link : https://codeforces.com/problemset/problem/977/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AWrongSubtraction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long num = in.nextLong();
        int k = in.nextInt();
        for (int i = 0; i <k ; i++) {

            if ((num % 10) == 0)
                num /= 10;
            else
                --num;
        }
        out.println(num);
    }
}
