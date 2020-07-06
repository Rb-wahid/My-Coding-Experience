package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Case of the Zeros and Ones
 *
 * link : https://codeforces.com/problemset/problem/556/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACaseOfTheZerosAndOnes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong();
        String str = in.next();
        char[] ch = str.toCharArray();
        int one = 0;
        int zero = 0;

        for (int i = 0; i <n; i++){
            if (ch[i] == '1')
                one++;
            else
                zero++;
        }

        out.println(Math.abs(one-zero));
    }
}
