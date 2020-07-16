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
        boolean ab = false, ba = false;
        char[] strings = string.toCharArray();

        for (int i = 0; i < strings.length - 1; ++i) {
            if(strings[i] == 'A' && strings[i + 1] == 'B' && !ab){
                ab = true;
                i++;
            }
            else if(strings[i] == 'B' && strings[i + 1] == 'A' && ab){
                ba = true;
            }
        }
        return ba;
    }

    boolean baString (String string) {
        char[] strings = string.toCharArray();
        boolean ab = false, ba = false;
        for (int i = 0; i < strings.length - 1; ++i) {
            if(strings[i] == 'B' && strings[i + 1] == 'A' && !ba){
                ba = true;
                i++;
            }
            else if(strings[i] == 'A' && strings[i + 1] == 'B' && ba){
                ab = true;
            }
        }

        return ab;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String string = in.next();

        if (abString(string))
            out.println("YES");
        else
        out.println( baString(string)? "YES" : "NO");
    }
}
