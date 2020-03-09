package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Panoramix's Prediction
 *
 * link : http://codeforces.com/contest/80/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APanoramixsPrediction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 2; i*i <= m ; i++) {
            if (m % i == 0){
                out.println("NO");
                return;
            }
        }

        out.println("YES");
    }
}
