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
import java.util.List;
import java.util.Map;

public class BTPrimes {
    boolean[] prime  = new boolean[1000];
    List<Integer> list = new ArrayList<>();

    void sieve() {

        for (int i = 2; i < 1000 ; i++) {
            prime[i] = true;
        }

        for (int i = 2; i < 1000; i++) {
            if (prime[i]) {
                list.add(i);
                for (int j = i * 2; j < 1000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    boolean isPrime(long num) {
        for(int i : list) {
            if (num <= i)
                break;
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long value;
        StringBuilder stringBuilder = new StringBuilder();
        sieve();
        for (int i = 0; i < n; i++) {
            value = in.nextLong();
            long sqrt = (long)Math.sqrt(value);

            if (sqrt * sqrt != value || value < 2)
                stringBuilder.append("NO" + "\n");
            else {
                if (isPrime(sqrt))
                    stringBuilder.append("YES" + "\n");
                else
                    stringBuilder.append("NO" + "\n");
            }
        }
        out.println(stringBuilder.toString());
    }
}
