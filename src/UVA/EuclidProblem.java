package UVA;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: 10104 - Euclid Problem - Online Judge
 *
 *link : https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=1045
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.List;
import java.util.Scanner;

public class EuclidProblem {


     long x,   y,   gcd;
    void extendedGcd(long a, long b){
        if (b == 0){
            x = 1;
            y = 0;
            gcd = a;
        }else {
            extendedGcd(b, a%b);
            long temp = x;
            x = y;
            y = temp-(a/b)*y;
        }

    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()){
          long  a = scanner.nextLong() ;
          long  b = scanner.nextLong();
           extendedGcd(a, b);
           out.println(x + " " + y + " " + gcd);

       }
            scanner.close();

    }
}
