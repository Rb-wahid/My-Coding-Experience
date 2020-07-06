package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. In Search of an Easy Problem
 *
 * link : https://codeforces.com/problemset/problem/1030/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AInSearchOfAnEasyProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int value = 0;

        for (int i = 0; i < n; i++) {
            value = in.nextInt();
            if (value == 1){
                value = 1;
                break;
        }
        }
        if (value != 1)
        out.println("EASY");
        else
            out.println("HARD");
    }
}
