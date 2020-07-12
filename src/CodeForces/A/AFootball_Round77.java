package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Football
 *
 * link : https://codeforces.com/problemset/problem/96/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFootball_Round77 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        String string = in.next();
        String[] strings = string.split("");
        String check = strings[0];
        int count = 0;
        int max = 0;

        for (int i = 0; i < string.length() ; i++) {
            if (strings[i].equals(check)){
                count++;
            }
            else {
                check = strings[i];
                max = Math.max(max, count);
                count = 1;
            }
        }

        out.println(max >= 7? "YES" : "NO");
    }
}
