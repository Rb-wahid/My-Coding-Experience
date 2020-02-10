package SpojOJ;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: COMDIV - Number of common divisors
 *
 *link : https://www.spoj.com/problems/COMDIV/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class NumberOfCommonDivisors {
    long gcd(long a, long b){
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-->0){
            long a = in.nextLong();
            long b = in.nextLong();
            long g = gcd(a,b);
            int result = 0;

            for (long i = 1; i <= Math.sqrt(g)  ; i++) {
                if (i*i == g)
                    result++;
                else if(g%i == 0)
                    result = result+2;

            }
            out.println(result);

        }

    }
}
