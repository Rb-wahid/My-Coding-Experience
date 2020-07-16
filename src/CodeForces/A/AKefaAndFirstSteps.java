package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Kefa and First Steps
 *
 * link : https://codeforces.com/problemset/problem/580/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AKefaAndFirstSteps {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <n-1 ; i++) {
            if (arr[i] <= arr[i+1]){
                count++;
                max = Math.max(max, count);
            }
            else {
                max = Math.max(max, count);
                count = 0;

            }
        }

        out.println(max > 0?max+1 : 1);
    }
}
