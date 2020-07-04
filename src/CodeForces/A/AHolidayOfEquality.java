package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Holiday Of Equality
 *
 * link : http://codeforces.com/problemset/problem/758/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class AHolidayOfEquality {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n-1];
        int value = 0;
        for (int i = 0; i <n-1 ; i++) {
            value += max - arr[i];
        }
        out.println(value);
    }
}
