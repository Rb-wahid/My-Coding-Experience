package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Twins
 *
 * link : https://codeforces.com/contest/160/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ATwins {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int coins = in.nextInt();
        int total = 0;
        int[] coin = new int[coins];

        for (int i = 0; i < coins; i++) {
            coin[i] = in.nextInt();
            total += coin[i];
        }

        total /= 2;
        Arrays.sort(coin);
        int p1 = 0, numberOfCoin = 0;
        for (int i = coins - 1; i > 0 ; i--) {
            p1 += coin[i];
            if (p1 > total) {
                break;
            }else {
                numberOfCoin++;
            }
        }
        out.println(numberOfCoin + 1);
    }
}
