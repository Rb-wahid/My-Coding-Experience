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

    int sub(int a, int b) {
        if (a % b == 0)
            return a/b;
        else return a/b + sub(b, a%b);
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        int a, b;

        while (t-- > 0) {
            a = in.nextInt();
            b = in.nextInt();

            out.println(sub(a, b));
        }
    }
}
