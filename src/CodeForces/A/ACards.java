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
        int n = in.nextInt();
        String s = in.readLine();
        String one = "";
        while ( n > 4){
            one += "1 ";
            n -= 3;
        }
        out.println(one + "0");
    }
}
