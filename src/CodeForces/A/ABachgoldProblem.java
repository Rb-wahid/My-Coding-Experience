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
    List<Integer> seive(int n) {

        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n+1];

        for (int i = 2; i <=n ; i++)
            prime[i] = true;

        for (int i = 2; i*i <= n ; i++)
            if (prime[i])
                for (int j = i*2 ; j <= n ; j+= i)
                    prime[j] = false;


        for(int i = 2; i <= n; i++)
            if(prime[i])
                list.add(i);

        return list;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        List<Integer> list = seive(n);
        List<Integer> numList = new ArrayList<>();

        while (n != 0) {
            for (Integer integer : list) {
                if (n % integer == 0) {
                    for (int j = 1; j <= n / integer; j++) {
                        numList.add(integer);
                        n -= integer;
                    }
                    break;
                }
                else {
                    numList.add(integer);
                    n -= integer;
                }
            }

        }
        out.println(numList.size());
        for (Integer i : numList)
             out.print(i + " ");
    }
}
