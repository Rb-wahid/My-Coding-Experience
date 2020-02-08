package Math;
/*
Problem Title: 11029 - Leading and Trailing - Online Judge
11029 - Leading and Trailing.java
11029 - Leading and Trailing java solution
link : https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1970
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Scanner;

public class LeadingAndTrailing {
    long firstkdigits (int n, int b, int k)
    {
        //take log10 of n^n.
        // log10(n^n) = n*log10(n)
        double product = b * Math.log10 (n);

    /* We will now try to separate the decimal
       and integral part of the /product. The
       floor function returns the smallest integer
       less than or equal to the argument. So in
       this case, product - floor(product) will
       give us the decimal part of product */
        double decimal_part = product - Math.floor (product);

        // we will now exponentiate this back by
        // raising 10 to the power of decimal part
        decimal_part = Math.pow (10, decimal_part);

    /* We now try to find the power of 10 by
       which we will have to multiply the decimal
       part to obtain our final answer */
        double digits = Math.pow (10, k - 1), i = 0;

        return ((long) (decimal_part * digits));
    }

    static long modularExpo (int x, int n, int m)
    {
        x %= m;

        long res = 1;
        while (n > 0)
        {
            if ((n & 1) == 1)
                res = (res * x) % m;
            x = (x * x) % m;
            n >>= 1;
        }

        return res;
    }


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt ();

        while (t-- > 0)
        {
            int n = sc.nextInt (), b = sc.nextInt ();
            int k = 3;
            String str = String.valueOf(modularExpo (n, b, 1000));
            int length = str.length();
            if (length < 3){
                if (3 - length == 1)
                    str = "0" + str;
                if (3 - length == 2)
                    str = "00" + str;
                }
            System.out.println (firstkdigits (n, b, k) + "..." + str);
        }
    }
}
