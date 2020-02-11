package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Is your horseshoe on the other hoof?
 *
 *link : https://codeforces.com/contest/228/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class AIsYourHorseshoeOnTheOtherHoof {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Set<Integer> set = new HashSet<>();
        int n ;
        for (int i = 0; i < 4 ; i++) {
            n = in.nextInt();
            set.add(n);
        }

        out.println(4 - set.size());
    }
}
