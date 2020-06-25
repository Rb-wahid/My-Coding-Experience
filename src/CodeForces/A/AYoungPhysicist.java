package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Young Physicist
 *
 * link : https://codeforces.com/problemset/problem/69/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AYoungPhysicist {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[3];

        for (int i = 0; i < n; i++) {
            arr[0] += in.nextInt();
            arr[1] += in.nextInt();
            arr[2] += in.nextInt();
        }

    if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
            out.println("YES");
        else
            out.println("NO");
    }
}
