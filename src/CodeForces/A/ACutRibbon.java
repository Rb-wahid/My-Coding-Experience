package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Cut Ribbon
 *
 * link : https://codeforces.com/problemset/problem/189/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ACutRibbon {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        Arrays.sort(arr);
        while ( n != 0) {
            if (n % arr[0] != 0){
                n -= arr[0];
                count++;
            }
            else {
                count += n/arr[0];
                break;
            }
            if (n % arr[1] != 0){
                n -= arr[1];
                count++;
            } else {
                count += n/arr[1];
                break;
            }
            if (n % arr[2] != 0) {
                n -= arr[2];
                count++;
            } else {
                count += n/arr[2];
                break;
            }
        }

        out.println(count);
    }
}
