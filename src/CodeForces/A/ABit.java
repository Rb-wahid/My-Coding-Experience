package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Bit++
 *
 * link : https://codeforces.com/problemset/problem/282/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABit {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();

        }
        int count = 0;
        for (int i = 0; i <n ; i++) {
            switch (arr[i]) {
                case "++X":
                    ++count;
                    break;
                case "--X":
                    --count;
                    break;
                case "X++":
                    count++;
                    break;
                case "X--":
                    count--;
                    break;
            }
        }
        out.println(count);
    }
}
