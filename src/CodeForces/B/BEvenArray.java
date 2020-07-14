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

            int o = 0;
            int e = 0;
            int[] arr = new int[n];

            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
                if ((arr[i]&1) != (i&1)) {
                    if ((i&1) == 1)
                    o++;
                    else
                        e++;
                }
            }

            out.println( e != o? "-1" : o);

        }
    }
}
