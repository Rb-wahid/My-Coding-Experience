package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Restore the Permutation by Merger
 *
 * link : https://codeforces.com/problemset/problem/1385/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.LinkedHashSet;
import java.util.Set;

public class BRestoreThePermutationByMerger {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0){
            int n = in.nextInt();
            Set<Integer> set = new LinkedHashSet<>();

            for (int i = 0; i < n*2 ; i++) {
                set.add(in.nextInt());
            }
            for (int i : set)
                out.print(i + " ");

            out.println();
        }
    }
}
