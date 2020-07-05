package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Jeff and Digits
 *
 * link : http://codeforces.com/problemset/problem/352/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class AJeffAndDigits {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        int f = 0;
        int z = 0;
        int value = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
          //  arr[i] = in.nextInt();
            value = in.nextInt();
            if (value == 5)
                f++;
            else
                z++;
        }

        if (z == 0)
            sb.append(-1);
       else if (f < 9)
            sb.append(0);
        else {
            sb.append("5".repeat((f / 9) * 9));
            sb.append("0".repeat(z));
        }
        out.println(sb.toString());
    }
}
