package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title:
 *
 * link :
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AXXXXX {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            int ans = 0;
            boolean flag = false;
            int temp = 0;
            long n = in.nextInt();
            long x = in.nextInt();
            int[] arr = new int[(int) n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                temp += arr[i];
            }

            if (temp % x == 0) {
                for (int i = 0; i < n; i++) {
                    int sum = 0;
                    for (int j = 0; j < n; j++) {
                        if (i != j) {
                            sum += arr[i] + arr[j];
                        }
                    }
                    if (sum % x != 0)
                        ++ans;
                }
                if (ans != 0)
                    out.println(ans);
                else
                    out.println(-1);
            } else
                out.println(n);
        }
    }
}
