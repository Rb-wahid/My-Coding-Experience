package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Cards
 *
 * link : https://codeforces.com/contest/1220/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACards {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x = in.nextInt();
        char[] s = in.readLine().toCharArray();
        String zero = "", one = "";

        for (int i = 0; i < x; i++){
            if (s[i] == 'r')
                zero += "0 ";
            if (s[i] == 'n')
                one += "1 ";
        }
        out.println(one + zero);
    }
}
