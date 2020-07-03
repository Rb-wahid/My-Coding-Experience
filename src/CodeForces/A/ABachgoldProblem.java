package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Bachgold Problem
 *
 * link : http://codeforces.com/problemset/problem/749/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class ABachgoldProblem {
    List<Integer> seive() {
        int n = 1_00_000;
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n+1];

        for (int i = 2; i * i<= n ; i++) {
            if (!prime[i]) {
                list.add(i);
                for (int j = i; j <= n ; j+= i) {
                    prime[j] = true;
                }
            }
        }
        return list;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        List<Integer> list = seive();
        int count = 0;
        int value;
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            for (int i = 0; i <= list.size() ; i++) {
                value = list.get(i);
                if (n % value == 0){
                    for (int j = 1; j <= n/value ; j++) {
                        sb.append(value + " ");
                        count++;
                        n -= value;
                    }
                    break;
                }
                else {

                    sb.append(value + " ");
                    count++;
                    n -= value;
                }
            }

        }
        out.println(count);
        out.println(sb.toString());
    }
}
