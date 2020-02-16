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

import java.math.BigInteger;
import java.util.Random;

public class AOlesyaAndRodion {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();

        if (n == 1){
            for (int i = 1; i <10 ; i++) {
                if (i%t == 0) {
                    out.println(i);
                    return;
                }
            }
        }
        else{
            int i = 100;
            while (i-->0){
                BigInteger value =  new BigInteger(getRandomNumber(n));

                if (value.mod(BigInteger.valueOf(10)).equals(BigInteger.ZERO))
                    continue;
                BigInteger ans = (value.mod(BigInteger.valueOf(t)));

                if (ans.equals(BigInteger.ZERO)) {
                    out.println(value);
                    return;
                }
            }
        }
        }
}
