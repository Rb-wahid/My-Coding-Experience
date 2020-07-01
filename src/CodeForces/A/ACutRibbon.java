package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Cut Ribbon
 *
 * link : https://codeforces.com/problemset/problem/189/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ACutRibbon {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] dp = new  int[n+1];

        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n ; i++) {
            if (i >= a) dp[i] = Math.max(dp[i], dp[i-a]+1);
            if (i >= b) dp[i] = Math.max(dp[i], dp[i-b]+1);
            if (i >= c) dp[i] = Math.max(dp[i], dp[i-c]+1);
        }
        out.println(dp[n]);
    }
}
