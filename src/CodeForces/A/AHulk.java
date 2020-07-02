package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Hulk
 *
 * link : http://codeforces.com/problemset/problem/705/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AHulk {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String hate = "I hate ";
        String love = "I love ";
        String that = "that ";
        StringBuilder sb = new StringBuilder();

            for (int j = 1; j < n ; j++) {
                if ((j&1) == 0 ) {
                    sb.append(love).append(that);
                }
                else
                    sb.append(hate).append(that);

            }

        if ((n&1) == 1)
            sb.append(hate).append("it");
        else
            sb.append(love).append("it");


        out.println(sb.toString());
    }
}
