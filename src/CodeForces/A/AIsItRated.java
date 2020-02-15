package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Is it rated?
 *
 * link : https://codeforces.com/contest/807/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class AIsItRated {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        String ans ;
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
            set.add(in.nextInt());
        }
        if (set.size() == n)
            ans = "unrated";
        else if (set.size() > n)
            ans = "rated";
        else
            ans = "maybe";

        out.println(ans);

    }
}
