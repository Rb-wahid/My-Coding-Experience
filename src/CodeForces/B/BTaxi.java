package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Taxi
 *
 * link : https://codeforces.com/problemset/problem/158/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class BTaxi {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        int[] arr = new int[t];
        int sum = 0;

        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        out.println((int) Math.ceil(sum/4.0));
    }
}
