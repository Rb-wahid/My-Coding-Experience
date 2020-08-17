package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Sequential Nim
 *
 * link : https://codeforces.com/problemset/problem/1382/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BSequentialNim {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            long[] arr = new long[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }

            while (count < n && arr[count] == 1)
                count++;

            if (n == count){
                if ((count&1) == 1)
                    out.println("First");
                else
                    out.println("Second");
            }
            else {
                if ((count&1) == 0)
                    out.println("First");
                else
                    out.println("Second");
            }
        }
    }
}
