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
        String ans = "maybe";
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i][0] != arr[i][1]) {
                ans = "rated";
                break;
            }
            else if (arr[i][0] == arr[i][1]){
                set.add(arr[i][0]);
            }
        }

        if (set.size() == n)
            ans = "unrated";

        out.println(ans);

    }
}
