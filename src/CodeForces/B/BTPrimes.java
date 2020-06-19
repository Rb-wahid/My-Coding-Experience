package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. T-primes
 *
 * link : http://codeforces.com/problemset/problem/230/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BTPrimes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int k = 0; k < n; k++){
            int count = 0;
            for (int i = 1; i <= arr[k] ; i++) {
                if (arr[k] % i == 0)
                    count++;
            }
            if (count == 3)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
