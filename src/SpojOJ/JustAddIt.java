package SpojOJ;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: ZSUM - Just Add It
 *
 *link : https://www.spoj.com/problems/ZSUM/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Scanner;

public class JustAddIt {

    int modularExponention(long x, int n, int m){
        x %= m;
        long result = 1;

        while (n > 0){
            if ((n&1) == 1)
                result = ( result * x) % m;

            x = (x * x) % m;
            n >>= 1;
        }

        return (int)result;
    }

    long Pn(int N, int m){
        long sum = 0;

        for (int i = 1; i <= N ; i++) {
            sum += modularExponention(i, i, m);
        }
        return sum;
    }

    long Sn(int N, int K, int m){
        long sum = 0;

        for (int i = 1; i <= N ; i++) {
            sum += modularExponention(i, K, m);
        }

        return sum;
    }

    long Zn(int N, int K, int m){

        return Sn(N, K, m) +  Pn(N, m);
    }

    long ans(int N, int K, int m){

        return (Zn(N, K, m) + Zn(N-1, K, m) - (2 * Zn(N-2, K, m))) % m;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int m = 10000007;
        while (true) {
            int n = in.nextInt();
            int k = in.nextInt();

            if (n == 0 && k == 0)
                break;
            out.println(ans(n, k, m) % m);
        }
    }
}
