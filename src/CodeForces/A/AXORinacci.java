package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. XORinacci
 *
 * link : https://codeforces.com/contest/1208/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AXORinacci {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[] arr = new int[3];
        int t = in.nextInt();
        int n;
        while (t-- > 0){
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            n = in.nextInt();
            arr[2] = arr[0] ^ arr[1];

            out.println(arr[n%3]);
        }

    }
}
