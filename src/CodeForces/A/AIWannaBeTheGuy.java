package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. I Wanna Be the Guy
 *
 * link : https://codeforces.com/contest/469/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class AIWannaBeTheGuy {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int p = in.nextInt();

        for (int i = 0; i < p; i++)
            set.add(in.nextInt());

        int q = in.nextInt();
        for (int i = 0; i < q; i++)
            set.add(in.nextInt());

        if (set.size() == n)
            out.println("I become the guy.");
        else
            out.println("Oh, my keyboard!");
    }
}
