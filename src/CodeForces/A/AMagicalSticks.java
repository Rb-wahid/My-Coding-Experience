package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Magical Sticks
 *
 * link : https://codeforces.com/problemset/problem/1371/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMagicalSticks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
      while (t-->0) {
          long num = in.nextLong();

          out.println((long) Math.ceil(num/2.0));
      }
    }
}
