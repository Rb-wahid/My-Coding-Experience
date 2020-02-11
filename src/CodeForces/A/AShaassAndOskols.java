package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Shaass and Oskols
 *
 *link : https://codeforces.com/contest/294/problem/A
 */
import FastIO.InputReader;
import FastIO.OutputWriter;

public class AShaassAndOskols {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] birds = new int[n];

        for (int i = 0; i < n; i++)
            birds[i] = in.nextInt();
        int m = in.nextInt();
        int x, y;
        for (int i = 0; i < m; i++) {
            x = in.nextInt();
            y = in.nextInt();

            --x;

            if (x != 0)
                birds[x-1] += y-1;
            if (x != n-1)
                birds[x+1] += birds[x] - y;

            birds[x] = 0;
        }

        for (int i = 0; i < n; i++)
            out.println(birds[i]);
    }
}
