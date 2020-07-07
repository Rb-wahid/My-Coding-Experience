package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Amusing Joke
 *
 * link : https://codeforces.com/problemset/problem/141/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AAmusingJoke {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String x = in.next();
        String y = in.next();
        String z = in.next();
        String string = x;
        string += y;

        char[] charsA = string.toCharArray();
        char[] charsB = z.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);

        boolean flag = true;

        if (charsA.length == charsB.length) {
            for (int i = 0; i <charsA.length; i++) {
                if (charsA[i] != charsB[i]){
                    flag = false;
                    break;
                }
            }
        }
        else
            flag = false;



        if (flag)
            out.println("YES");
        else
            out.println("NO");
    }
}
