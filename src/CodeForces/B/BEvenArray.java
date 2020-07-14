package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Even Array
 *
 * link : https://codeforces.com/problemset/problem/1367/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BEvenArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t =  in.nextInt();

        while (t-->0) {
            int n  = in.nextInt();

            int count = 0;
            int[] arr = new int[n];

            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
                if ((arr[i]&1) == 1 && (i&1) == 0) {
                    count++;
                }
            }

            out.println(n < 2? "-1" : count);

        }
    }
}
