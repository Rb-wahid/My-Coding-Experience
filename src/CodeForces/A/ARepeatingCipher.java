package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Repeating Cipher
 *
 * link : https://codeforces.com/problemset/problem/1095/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ARepeatingCipher {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String string = in.next();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        char[] ch = string.toCharArray();

        int v = 0;
        while (v != n) {
            sb.append(ch[v]);
            count++;
            v += count;
        }
        out.println(sb);

    }
}
