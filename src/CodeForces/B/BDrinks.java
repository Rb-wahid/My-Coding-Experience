package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Drinks
 *
 * link : https://codeforces.com/problemset/problem/200/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BDrinks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        double sum = 0;

        for (int i = 0; i <n ; i++) {
            sum += in.nextInt();
        }
        double ans = sum/n;
        String string =  String.format("%.12f", ans);

        out.println(string);
    }
}
