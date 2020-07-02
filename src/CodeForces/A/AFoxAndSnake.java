package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Fox And Snake
 *
 * link : http://codeforces.com/problemset/problem/510/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFoxAndSnake {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[n][m];
        boolean flag = true;

        for (int i = 0; i < n ; i+= 2) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = "#";
            }
        }

        for (int i = 1; i < n ; i+= 2) {

            for (int j = 1; j < m-1; j++) {
                    arr[i][j] = ".";

            }

            if (flag){
                arr[i][0] = ".";
                arr[i][m-1] = "#";
                flag = false;
            }
            else {
                arr[i][0] = "#";
                arr[i][m-1] = ".";
                flag = true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print(arr[i][j]);
            }
            out.println();
        }

    }
}
