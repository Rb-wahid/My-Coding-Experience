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

        int oneThree = 0;
        int two = 0;
        int four = 0;
        int count = 0;

        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
           if (arr[i] == 1 || arr[i] == 3)
               oneThree += arr[i];
           else if (arr[i] == 2)
               two += arr[i];
           else
               four += arr[i];
        }

        count = four / 4;
        count += (int) Math.ceil((two/4.0));
        count += (int) Math.ceil((oneThree/4.0));

        out.println(count);
    }
}
