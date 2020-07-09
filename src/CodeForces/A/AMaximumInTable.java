package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Maximum in Table
 *
 * link : https://codeforces.com/problemset/problem/509/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMaximumInTable {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[][] arr = new int[n+1][n+1];

        for (int i = 1; i <=n ; i++) {
            arr[1][i] = 1;
            arr[i][1] = 1;
        }
        int value = 0;
        for (int i = 2; i <=n ; i++) {
            for (int j = 2; j <=n ; j++) {
                value = arr[i-1][j] + arr[i][j-1];
                arr[i][j] = value;
            }
        }

        out.println(arr[n][n]);
    }
}
