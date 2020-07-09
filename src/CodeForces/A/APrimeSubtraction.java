package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Prime Subtraction
 *
 * link : https://codeforces.com/problemset/problem/1238/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APrimeSubtraction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-->0) {
            long x = in.nextLong();
            long z = in.nextLong();

            List<Integer> list = new ArrayList<>();
            boolean[] prime = new boolean[1001];
            Arrays.fill(prime, true);
            prime[0] = prime[1] = false;
            boolean flag = false;

            for (int i = 2; i * i <= 1000 ; i++) {
                if (prime[i])
                    for (int j = i * i; j <= 1000 ; j += i) {
                        prime[j] = false;
                    }
            }

            for (int i = 2; i <= 1000; i++)
                if (prime[i])
                    list.add(i);

                long num = z-x;

            for (int i = 0; i < list.size() ; i++) {
                if (num % list.get(i) == 0){
                    flag = true;
                    break;
                }
            }
            if (flag)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
