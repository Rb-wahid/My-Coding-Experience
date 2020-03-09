package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Panoramix's Prediction
 *
 * link : http://codeforces.com/contest/80/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APanoramixsPrediction {

    List sieve(int num){
        boolean[] primes = new boolean[num+1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i * i <= num ; i++) {
            if (primes[i]){
                for (int j = i*i; j <= num ; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int j = 2; j <= num ; j++) {
            if (primes[j])
                list.add(j);
        }
        return list;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> primes;
        String ans ;

        primes = sieve(70);

        int nextPrime = primes.get(primes.indexOf(n) +1);

        ans = nextPrime == m ? "YES" : "NO";
        out.println(ans);
    }
}
