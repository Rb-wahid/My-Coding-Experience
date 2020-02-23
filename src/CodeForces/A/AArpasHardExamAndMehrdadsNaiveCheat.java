package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Arpa’s hard exam and Mehrdad’s naive cheat
 *
 * link : http://codeforces.com/contest/742/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AArpasHardExamAndMehrdadsNaiveCheat {

    int modularExponentiation(int x, int n, int m){
        long result = 1;

        while (n > 0){
            if ((n&1) == 1)
                result = (result*x) % m;
            x = (x*x)%m;
            n >>= 1;
        }
        return (int)result;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int x = 1378;
        int m = 10;

        out.println(modularExponentiation(x, n, m));
    }
}
