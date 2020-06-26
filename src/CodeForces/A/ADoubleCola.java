package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Double Cola
 *
 * link : https://codeforces.com/problemset/problem/82/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADoubleCola {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong();
        String[] names = {
                "Sheldon", "Leonard", "Penny", "Rajesh", "Howard"
        };
        long power = 1;

        while (n > power*names.length){
            n -= power*names.length;
            power *= 2;
        }
        long ans = (n-1)/power;
        out.println(names[(int)ans]);
    }
}
