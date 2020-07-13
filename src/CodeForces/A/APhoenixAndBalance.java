package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Phoenix and Balance
 *
 * link : https://codeforces.com/problemset/problem/1348/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class APhoenixAndBalance {
    List<Integer> power(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            list.add((int)Math.pow(2, i));
        }

        return list;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();

            List<Integer> list ;
            list = power(n);
            List<Integer> list2 = new ArrayList<>();
        int a = 0;
        int b = 0;
           if (n > 2){
               for (int i = 0; i < list.size()/2; i++) {
                   a += list.get(i)+list.get(list.size()-i-1);
                   b += list.get(i+1)+list.get(list.size()-i-2);
                   i++;
               }
               out.println(Math.abs(a-b));
           } else {
               out.println(Math.abs(list.get(0) - list.get(1)));
           }


        }
    }
}
