package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Two Substrings
 *
 * link : https://codeforces.com/problemset/problem/550/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATwoSubstrings {

    boolean abString (String string) {
        if (string.length() <4)
            return false;
        char[] chars = string.toCharArray();
        boolean flag = false;

        for (int i = 0; i <chars.length-1 ; i++) {
            if (chars[i] == 'A' && chars[i+1] == 'B'){
                flag = true;
                break;
            }
        }

        for (int i = chars.length-1; i > 0 ; i--) {
            if (chars[i] == 'B' && chars[i-1] == 'A'){
                return flag;
            }
        }
        return false;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String string = in.next();

        out.println(abString(string)? "YES" : "NO");
    }
}
