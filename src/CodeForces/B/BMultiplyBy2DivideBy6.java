package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Multiply by 2, divide by 6
 *
 * link : https://codeforces.com/contest/1374/problem/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BMultiplyBy2DivideBy6 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t--> 0){
            long n = in.nextInt();
            int count = 0;
            boolean flag = true;
            while (n != 1){
                count++;
                if (count > 100 ){
                    flag = false;
                    break;
                }
                if ((n%6) == 0)
                    n /= 6;
                else
                    n *= 2;
            }
            if (flag)
            out.println(count);
            else
                out.println(-1);
        }
    }
}
