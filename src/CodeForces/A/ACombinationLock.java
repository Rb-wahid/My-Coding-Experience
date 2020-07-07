package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Combination Lock
 *
 * link : https://codeforces.com/problemset/problem/540/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACombinationLock {

    int operation(int a, int b) {
        int num , temp;
        if (a > b) {
            num = a-b;
            temp = (9-a) + b +1;

        }
        else {
            num = b-a;
            temp = a + (9-b) +1;
        }
        return Math.min(num, temp);
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String str = in.next();
        String keys = in.next();
        String[] pass = str.split("");
        String[] key = keys.split("");
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += operation(Integer.parseInt(pass[i]), Integer.parseInt(key[i]));
        }

        out.println(count);
    }
}
