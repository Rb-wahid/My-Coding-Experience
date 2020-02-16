package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Olesya and Rodion
 *
 * link : https://codeforces.com/contest/584/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AOlesyaAndRodion {
    long binaryExponentiation(int x, int n){
        long result = 1;

        while (n > 0){
            if ((n&1) == 1)
                result = (result*x);

            x = x*x;
            n = n>>1;
        }

        return result;
    }

    long ans(int n, int t){
        long value;

        for (int i = 1; i*i <= 2147483647 ; i ++) {
             value = binaryExponentiation(2, i);
            if (String.valueOf(value).length() == n && value%t == 0)
                return value;
        }

        return -1;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();

        out.println(ans(n, t));
    }
}
