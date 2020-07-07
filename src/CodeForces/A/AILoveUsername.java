package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. I_love_%username%
 *
 * link : https://codeforces.com/problemset/problem/155/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AILoveUsername {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int value ;
        if (t < 2 )
        out.println(0);
        else {
            for (int i = 0; i < t; i++) {
                value = arr[i];
                if (value > 0 && max < value){
                    max = value;
                    count++;
                }
                if (value < 0 && min > value){
                    min = value;
                    count++;
                }
            }
            out.println(count);
        }

    }
}
