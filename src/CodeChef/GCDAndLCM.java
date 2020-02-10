package CodeChef;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: GCD and LCM
 *
 *link : https://www.codechef.com/problems/FLOW016
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class GCDAndLCM {

    long gcd(long a, long b){

        return b == 0? a : gcd(b, a%b);
    }

    long lcm(long a, long b){

        return (a / gcd(a, b)) * b;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

      try {
          int t = in.nextInt();

          while (t-->0){
              long a = in.nextLong();
              long b = in.nextLong();

              out.println(gcd(a, b) + " " + lcm(a, b));
          }
      }catch (Exception e){

      }
    }
}
