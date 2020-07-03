package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Frog Jumping
 *
 * link : http://codeforces.com/problemset/problem/1077/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFrogJumping {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
       int t = in.nextInt();

       while (t-->0){
           long a = in.nextInt();
           long b = in.nextInt();
           long k = in.nextInt();
            long temp = 0;
           long current = 0;

           if ((k&1) == 0){
               a *=  k >> 1;
               b *=  k >>1;
           } else {
               --k;
               temp = a;
               a *= k>>1;
               b *= k>>1;
               a += temp;
           }

           out.println(a-b);
       }
    }
}
