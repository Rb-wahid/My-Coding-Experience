package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Mahmoud and a Triangle
 *
 * link : https://codeforces.com/problemset/problem/766/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class BMahmoudAndATriangle {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < n-2; i++) {
            if (arr[i] + arr[i+1] > arr[i+2]){
                flag = true;
                break;
            }
        }

        if (flag)
            out.println("YES");
        else
            out.println("NO");
    }
}
