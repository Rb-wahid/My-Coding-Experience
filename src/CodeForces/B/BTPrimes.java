package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. T-primes
 *
 * link : http://codeforces.com/problemset/problem/230/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BTPrimes {
    Map<Long, Boolean>  tprime;

    void sieve() {
        tprime = new HashMap<>();
        boolean[] prime  = new boolean[1000];

        for (int i = 2; i < 1000 ; i++) {
            prime[i] = true;
        }

        for (int i = 2; i < 1000; i++) {
            if (prime[i])
            for (int j = i * 2; j < 1000; j+= i) {
                prime[j] = false;
            }
        }

        for (int i = 2; i < 1000; i++){
            if (prime[i]) {
                tprime.put((long) i*i, true);
            }
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long value;

        for (int i = 0; i < n; i++) {
            value = in.nextLong();

            sieve();
            if (tprime.containsKey(value))
                out.println("YES");
            else
                out.println("NO");

        }
    }
}
