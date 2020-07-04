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

    long solve (long x, long y, long a , long b){

        long op2 = operation_2(x, y);
        op2 *= b;
       long op1 = Math.abs(x-y) * a;

       return op1+op2;
    }

     long operation_2(long x, long y){
         long count = 0;
        while (x != 0 && y != 0) {

            --x;
            --y;
            count++;
        }
        return count;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long x = in.nextLong();
            long y = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();

            long ans = solve(x, y, a, b);
            out.println(ans);
        }
    }
}
