package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Ilya and Bank Account
 *
 * link : https://codeforces.com/problemset/problem/313/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AIlyaAndBankAccount {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        long num = in.nextLong();

        if (num > 0)
            out.println(num);
        else {
            String strX = String.valueOf(num);
            String strY = strX.substring(0, strX.length()-2);
                strY += strX.substring(strX.length()-1, strX.length());
                strX = strX.substring(0, strX.length()-1);

            long x = Long.parseLong(strX);
            long y = Long.parseLong(strY);
            out.println(Math.max(x, y));
        }
    }
}
