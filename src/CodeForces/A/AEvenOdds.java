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
        long index;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i += 2)
            list.add(i);
        for (int i = 2; i <= n; i += 2)
            list.add(i);

        out.println(list.get((int) k - 1));
    }
}
