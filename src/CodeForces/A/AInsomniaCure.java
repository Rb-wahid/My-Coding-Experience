package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Insomnia cure
 *
 * link : https://codeforces.com/problemset/problem/148/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class AInsomniaCure {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int d = in.nextInt();

        boolean[] check = new boolean[d+1];
        Arrays.fill(check, true);

        for (int i = k; i <= d ; i += k) {
            if (check[i])
                check[i] = false;
        }
        for (int i = l; i <= d ; i += l) {
            if (check[i])
                check[i] = false;
        }
        for (int i = m; i <= d ; i += m) {
            if (check[i])
                check[i] = false;
        }
        for (int i = n; i <= d ; i += n) {
            if (check[i])
                check[i] = false;
        }

        int count = 0;

        for (int i = 1; i <= d; i++)
            if (!check[i]) {
                count++;
            }

        out.println(count);
    }
}
