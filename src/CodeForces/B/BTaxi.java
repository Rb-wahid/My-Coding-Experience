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

        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }

        int count = t+1;
        int value;

        for (int i = 0; i < t; i++) {
            value = arr[i];
            if (value == 4)
                count--;
            else {
                for (int j = 0; j < t; j++) {
                    if (i != j)
                    if (value+arr[i] == 4 ){
                        count--;
                        break;
                    }
                }
            }
        }

        out.println(count);
    }
}
