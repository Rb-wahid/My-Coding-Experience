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

        for (int i = 1; i < n-1; i++) {
                arr[i] = arr[i]^1;
        }
        if (arr[n-1] == 0)
            arr[n-1] = arr[n-1]^1;
        int count = 0;

        for (int i : arr){
            if (i == 1)
                count++;
        }
        if (arr.length == 1)
            count = 0;
        out.println(count);
    }
}
