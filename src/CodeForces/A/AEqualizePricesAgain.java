package CodeForces.A;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AEqualizePricesAgain {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            double n =(int) in.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += in.nextInt();
            }

            int ans =(int) Math.ceil(sum/n);
            out.println(ans);
        }
    }
}
