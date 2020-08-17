package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Distinct Digits
 *
 * link : https://codeforces.com/problemset/problem/1228/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ADistinctDigits {
    void print(Set<Integer> set){
        for (int i : set)
            System.out.print(i);

        System.out.println();
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int l = in.nextInt();
        int r = in.nextInt();
        Set<Integer> set;
        int value = 0;
        boolean flag = false;
        for (int i = l; i <= r ; i++) {
            set = new HashSet<>();
            value = i;
            while (value!= 0){
                set.add(value%10);
                value /= 10;
            }
            if (set.size() == String.valueOf(i).length()) {
                out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag)
            out.println(-1);
    }
}
