package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Anton and Letters
 *
 *link : https://codeforces.com/contest/443/problem/A
 */
import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class AAntonAndLetters {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Set<Character> set = new HashSet<>();;
        String str = in.readLine();
        str = str.replaceAll("[{}, ]", "");
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        out.println(set.size());
    }
}
