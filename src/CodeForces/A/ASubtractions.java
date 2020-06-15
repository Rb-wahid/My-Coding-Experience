package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Subtractions
 *
 * link : https://codeforces.com/problemset/problem/267/A
 */
import FastIO.InputReader;
import FastIO.OutputWriter;

public class ASubtractions {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        int a, b, count;

        while (t-- > 0) {
            count = 0;

            a = in.nextInt();
            b = in.nextInt();

            while (a != 0 && b != 0) {
                count++;
                if (a < b)
                    b -= a;
                else
                    a -= b;
            }

            out.println(count);
        }
    }
}
