package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Oath of the Night's Watch
 *
 * link : https://codeforces.com/contest/768/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AOathOfTheNightsWatch {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int length = in.nextInt();
        int[] arr = new int[length];
        int ans = 0;

        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        if (length <= 2)
            ans = 0;
        else
        {
            for (int i = 1; i < length - 1; i++) {
                if (arr[i] > arr[i-1] && arr[i+1] > arr[i])
                    ans++;
            }
        }

        out.println(ans);
    }
}
