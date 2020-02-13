package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Pangram
 *
 * link : https://codeforces.com/contest/520/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class APangram {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int length = in.nextInt();
        String str = in.readLine().toLowerCase();

        if (length < 26)
            out.println("NO");
        else {
            Set<Character> set = new HashSet<>();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                set.add(ch[i]);
            }
                out.println(set.size() < 26? "NO" : "YES");
        }
    }
}
