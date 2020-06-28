package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Tram
 *
 * link : https://codeforces.com/problemset/problem/116/A
 */


import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATram {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        int max = Integer.MIN_VALUE;
        int current = 0;
        while (t-->0) {
            int a = in.nextInt();
            int b = in.nextInt();
            current -=a;
            current += b;
            max = Math.max(max, current);
        }
        out.println(max);
    }
}
