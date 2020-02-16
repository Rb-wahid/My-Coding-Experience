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

        int n = in.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();

            if (arr[i][0] != arr[i][1]) {
                out.println("rated");
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i][0] < arr[i][1]) {
                out.println("unrated");
                return;
            }
        }

        out.println("maybe");

    }
}
