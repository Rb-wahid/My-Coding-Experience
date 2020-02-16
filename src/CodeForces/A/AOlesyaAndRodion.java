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

        if (n == 1 && t == 10){
           out.println(-1);
        }
        else{
            out.print(t);
            if (t == 10) {
                for (int i = 1; i < n-1; i++)
                    out.print(0);
            }
            else
                for (int i = 1; i < n; i++)
                    out.print(0);
        }
        }
}
