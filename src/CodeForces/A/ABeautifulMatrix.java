package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Beautiful Matrix
 *
 * link : https://codeforces.com/problemset/problem/263/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABeautifulMatrix {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int[][] arr = new int[6][6];

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                arr[i][j] = in.nextInt();

                if (arr[i][j] == 1){
                    out.println(Math.abs(3-i) + Math.abs (3-j));
                    break;
                }
            }
        }
    }
}
