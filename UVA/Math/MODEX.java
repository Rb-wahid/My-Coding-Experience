package Math;
/*
Problem Title: 1230-Modex - Online Judge
1230 - MODEX.java
1230 - MODEX java solution
link : https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3671
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class MODEX {
    int modularExponentiation(int x, int n, int m){
        int result = 1;

        while (n > 0){
            if ((n & 1) == 1)
                result = (result * x) % m;
            x = (x * x) % m;
            n >>= 1;
        }
        return  result;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int test = in.nextInt();

        while (test-- > 0){
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();

            out.println(modularExponentiation(x, y, n));
        }
    }
}
