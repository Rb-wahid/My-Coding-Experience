package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Juicer
 *
 *link : https://codeforces.com/contest/709/problem/A
 */
import FastIO.InputReader;
import FastIO.OutputWriter;

public class AJuicer {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();
        int b = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        int result = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > b)
                continue;
            else {
                sum += arr[i];
                if (sum > d) {
                    result++;
                    sum = 0;
                }
            }
        }

        out.println(result);
    }
}
