package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Common Subsequence
 *
 * link : https://codeforces.com/problemset/problem/1382/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ACommonSubsequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0){
            int n = in.nextInt();
            int m = in.nextInt();

            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                listA.add(in.nextInt());
            }

            for (int i = 0; i < m; i++) {
                listB.add(in.nextInt());
            }

            List<Integer> ans =  listA.stream()
                    .filter(listB::contains)
                    .collect(Collectors.toList());

            if (ans.size() > 0) {
                out.println("Yes");
                out.println(1 + " " + ans.get(0));
            }
            else
                out.println("NO");
        }
    }
}
