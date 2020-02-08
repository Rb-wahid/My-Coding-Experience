package Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Calculations with Modulo
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/calculations-with-modulopractice/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalculationswithModulo {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.nextLong();
        int b = in.nextInt();
        long c = in.nextLong();
        long m = in.nextLong();
        BigInteger abPower, modInv, multi;
        BigInteger bigIntegerA = new BigInteger(String.valueOf(a));
        BigInteger bigIntegerB = new BigInteger(String.valueOf(b));
        BigInteger bigIntegerC = new BigInteger(String.valueOf(c));
        BigInteger bigIntegerM = new BigInteger(String.valueOf(m));


        abPower = bigIntegerA.modPow(bigIntegerB, bigIntegerM);
        modInv = bigIntegerC.modInverse(bigIntegerM);
        multi = abPower.multiply(modInv);
        out.println(multi.mod(bigIntegerM));

    }
}
