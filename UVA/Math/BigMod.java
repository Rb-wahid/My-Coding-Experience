package Math;
/*
Problem Title: 374 - Big Mod - Online Judge
374 - Big Mod.java
374 - Big Mod java solution
link : https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=310
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Scanner;

public class BigMod {
    long modularExponentiation(long x, long n, long m){
        long result = 1;

        while (n > 0){
            if ((n & 1) == 1)
                result = (result * x) % m;

            x = ( x * x) % m;
            n >>= 1;
        }
        return  result;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            long B = sc.nextLong();
            long P = sc.nextLong();
            long M = sc.nextLong();

            out.println(modularExponentiation(B, P, M));
        }
    }
}
