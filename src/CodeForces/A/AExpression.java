package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Expression
 *
 * link : http://codeforces.com/problemset/problem/479/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AExpression {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int value = 0;
        int max = Integer.MIN_VALUE;

        value = a + b * c ;
        max = Math.max(max, value);

        value = a * b * c;
        max = Math.max(max, value);

        value = a + b + c;
        max = Math.max(max, value);

        value = a * (b + c);
        max = Math.max(max, value);

        value = (a + b) * c;
        max = Math.max(max, value);

       out.println(max);


    }
}
