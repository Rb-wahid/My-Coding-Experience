package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Epic Game
 *
 * link : https://codeforces.com/problemset/problem/119/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AEpicGame {
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int aa = 0;
        int bb = 0;
        int temp = 0;

        while (true){

            if (n != 0) {
                temp = gcd(a, n);
                aa++;
                n -= temp;
            }

            else
                break;

            if (n!= 0) {
                temp = gcd(b, n);
                bb++;
                n -= temp;
            }

            else
                break;

        }

        if (aa > bb)
        out.println(0);
        else
            out.println(1);
    }
}
