package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. New Year Candles
 *
 * link : https://codeforces.com/problemset/problem/379/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANewYearCandles {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int a = in.nextInt();
        int b = in.nextInt();
        int totalHour = a;

        while ( a >= b) {
            a /= b;
            totalHour += a;
        }

        out.println(totalHour);
    }
}
