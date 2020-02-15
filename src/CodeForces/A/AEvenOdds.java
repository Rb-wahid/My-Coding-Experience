package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Even Odds
 *
 * link : https://codeforces.com/contest/318/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AEvenOdds {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong();
        long k = in.nextLong();
        long mid = (n&1) == 0 ? n>>1 : (n>>1) + 1;
        long ans ;

        if (k <= mid)
            ans = (2 * k) - 1;
        else {
            k -= mid;
            ans = 2 * k;
        }

        out.println(ans);
    }
}
