package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. IQ test
 *
 * link : https://codeforces.com/problemset/problem/25/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AIQTest {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if ((arr[i] & 1) == 0)
                even++;
        }

        odd = arr.length - even;

        if (even > odd) {
            for (int i = 0; i < n; i++)
                if ((arr[i] & 1) == 1) {
                    out.println(i+1);
                    break;
                }
        }
        else {
            for (int i = 0; i < n; i++)
                        if ((arr[i]&1) == 0){
                            out.println(i+1);
                            break;
                        }
                }

    }
}
