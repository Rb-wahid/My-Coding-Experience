package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Omkar and Last Class of Math
 *
 * link : https://codeforces.com/contest/1372/problem/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class BOmkarAndLastClassOfMath {

    public void solve(int testNumber, InputReader in, OutputWriter out) {

         int t = in.nextInt();
         while (t-->0){
             long num = in.nextLong();
        long k = num;
             for (int i = 2; i <= 100000 ; i++) {
                    if (num%i == 0){
                        k = i;
                        break;
                    }
             }
             out.println(num/k + " " + (num - (num/k)));
         }
    }
}
