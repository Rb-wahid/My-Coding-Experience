package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Flipping Game
 *
 * link : https://codeforces.com/problemset/problem/327/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFlippingGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        if (arr.length == 1 && arr[0] == 1)
            arr[0] = 0;
        else {
            if (arr[n - 1] == 0)
                arr[n - 1] = arr[n - 1] ^ 1;


            for (int i = 1; i < n - 1; i++) {
                arr[i] = arr[i] ^ 1;
            }
        }
        for (int i : arr) {
            if (i == 1)
                count++;
        }
        out.println(count);
    }
}
