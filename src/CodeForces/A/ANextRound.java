package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Next Round
 *
 * link : http://codeforces.com/problemset/problem/158/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANextRound {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        int passed = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
           arr[i] = in.nextInt();
        }
        passed = arr[k-1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= passed && arr[i] > 0)
                count++;
        }
        out.println(count);
    }
}
