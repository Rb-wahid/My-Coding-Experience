package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Hit the Lottery
 *
 * link : https://codeforces.com/problemset/problem/996/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AHitTheLottery {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long num = in.nextLong();
        int count = 0;
        while (num != 0){
            if (num-100 >= 0){
                num -= 100;
                count++;
            }
            else if (num-20 >= 0){
                num -= 20;
                count++;
            }
            else if (num-10 >= 0){
                num -= 10;
                count++;
            }
            else if (num-5 >= 0){
                num -= 5;
                count++;
            }
            else {
                num --;
                count++;
            }
        }

        out.println(count);
    }
}
