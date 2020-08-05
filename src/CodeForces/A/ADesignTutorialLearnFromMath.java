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

    List<Integer> seive(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);

        for (int i = 2; i*i <=n ; i++) {
            if (prime[i])
                for (int j = i*i; j <= n ; j += i) {
                    prime[j] = false;
                }
        }

        for (int i = 2; i <= n ; i++) {
            if (!prime[i])
                list.add(i);
        }

        return list;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        List<Integer> list = seive(n);
        int a = 0,  b = 0;

        if ((n&1) == 0){
            a = b = n>>1;
        }
        else {
            for (int i = 0; i <list.size() ; i++) {
                for (int j = list.size()-1; j >=0 ; j--) {
                    if (list.get(i) + list.get(j) == n){
                        a = list.get(j);
                        b = list.get(i);
                        break;
                    }
                }
            }
        }


        out.println(a + " " + b);
    }
}
