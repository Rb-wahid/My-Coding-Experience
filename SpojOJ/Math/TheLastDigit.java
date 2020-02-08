package Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: LASTDIG - The last digit
 *
 *link : https://www.spoj.com/problems/LASTDIG/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Scanner;

public class TheLastDigit {

    public void solve(int testNumber, InputReader in, OutputWriter out) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int a = scanner.nextInt();
            long b = scanner.nextLong();

            if (b == 0)
                System.out.println(1);
            else{
                b = b % 4;
                if (b == 0)
                    b = 4;
                System.out.println((int) Math.pow(a, b) % 10);
            }
        }
    }
}
