package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Design Tutorial: Learn from Math
 *
 * link : https://codeforces.com/problemset/problem/472/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ADesignTutorialLearnFromMath {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        int a = 0,  b = 0;

        if ((n&1) == 0 ){
           a = 8;
           b = n-8;
        }
        else {
           a = 9;
           b = n-9;
        }


        out.println(b + " " + a);
    }
}
