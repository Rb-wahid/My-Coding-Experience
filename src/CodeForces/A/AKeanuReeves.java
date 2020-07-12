package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Keanu Reeves
 *
 * link : https://codeforces.com/problemset/problem/1189/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AKeanuReeves {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        String str = in.next();
        String[] strings = str.split("");

        int one = 0;
        int zero = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n ; i++) {
            if (strings[i].equals("1"))
                one++;
        }

        zero = strings.length-one;

        if (one != zero) {
            sb.append(1).append(" ");
            for (String s : strings)
                sb.append(s);
        }
        else {
            sb.append(2).append("\n");
            sb.append(strings[0]).append(" ");
            for (int i = 1; i < n; i++) {
                sb.append(strings[i]);
            }
        }

        out.println(sb);
    }
}
