package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Road To Zero
 *
 * link : http://codeforces.com/problemset/problem/1342/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ARoadToZero {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long x = in.nextLong();
            long y = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long op1 = 0, op2 = 0;
            if(x < y){
                op1 = x * b;
                op2 = (y-x) * a;
            }
            else if (x > y){
                op1 = y * b;
                op2 = (x-y) * a;
            }

            out.println(op1+op2);
        }
    }
}
