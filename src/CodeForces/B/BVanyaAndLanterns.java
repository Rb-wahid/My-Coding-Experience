package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Vanya and Lanterns
 *
 * link : https://codeforces.com/problemset/problem/492/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.*;

public class BVanyaAndLanterns {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long l = in.nextLong();

        List<Long> list = new ArrayList();
        List<Double> list2 = new ArrayList();
        double value = 0d;

        for (int i = 0; i < n; i++) {
            list.add(in.nextLong());
        }
        Collections.sort(list);

        long a = 0;
        for (int i = n-1 ; i > 0; i--) {
            value = (double) list.get(i)- list.get(i-1);
            list2.add(value/2.0);
        }
        value = (double) list.get(0);
        list2.add(value);
        Collections.sort(list2);

        String string = String.format("%.10f", list2.get(list2.size()-1));

        out.println(string);
    }
}
