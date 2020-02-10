package CodeChef;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Appy and Contest
 *
 *link : https://www.codechef.com/problems/HMAPPY2
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;
import java.util.Scanner;

public class AppyAndContest {

    long gcd(long A, long B){

        return B == 0? A : gcd(B, A%B);
    }

    long divisible(long A, long B, long N){
        long divisibleByA = N/A;
        long divisibleByB = N/B;

        long divisibleByLCM = N/((A*B)/gcd(A, B));

        long divisibleAorB = divisibleByA + divisibleByB - divisibleByLCM;
        long divisibleAnotB = divisibleAorB - divisibleByB;
        long divisibleBnotA = divisibleAorB - divisibleByA;

        return divisibleAnotB + divisibleBnotA;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-- > 0) {
            long N = in.nextLong();
            long A = in.nextLong();
            long B = in.nextLong();
            long K = in.nextLong();
            long ans = divisible(A, B, N);

            if (ans >= K)
                out.println("Win");
            else
                out.println("Lose");
        }
    }

}
