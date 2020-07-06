package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Cheap Travel
 *
 * link : https://codeforces.com/problemset/problem/466/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACheapTravel {

    int priceForOptimal(int n, int m, int a, int b){
        int oldN = n;
            if (n%m == 0){
                return b * (n/m);
            }
            else {
                int countForb = 0;
                while (n-m > 0) {
                        n -= m;
                        countForb++;
                }

                return  (countForb*b) + ((oldN-(countForb*m))*a);
            }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int priceForSingle = n * a;
        int optimalPrice = priceForOptimal(n, m, a, b);

        out.println(Math.min(priceForSingle, optimalPrice));

    }
}
