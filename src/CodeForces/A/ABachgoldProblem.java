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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ABachgoldProblem {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
       if ((n&1) == 0){
           for (int i = 1; i <= n/2 ; i++) {
               list.add(2);
           }
       }
       else {
           n -= 3;
           for (int i = 1; i <= n/2 ; i++) {
               list.add(2);
           }
           list.add(3);
       }

        out.println(list.size());
       for (int i : list)
           out.print(i + " ");
    }
}
