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

        int n = in.nextInt();

        int[] arr = new int[5];

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();

            arr[value] += 1;
        }
        int sum = arr[4] + arr[3] + (arr[2]>>1);
        arr[1] -= arr[3];

        if (arr[2]%2 != 0) {
            sum++;
            arr[1] -= 2;
        }
        if (arr[1] > 0 )
            sum += (arr[1] +3)/4;

        out.println(sum);

    }
}
