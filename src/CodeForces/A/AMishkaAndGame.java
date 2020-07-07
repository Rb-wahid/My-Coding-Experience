package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Mishka and Game
 *
 * link : https://codeforces.com/problemset/problem/703/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMishkaAndGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();


        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a > b)
                x++;
            if ( a < b)
                y++;
        }
        if (x == y)
            out.println("Friendship is magic!^^");
        else if (x > y)
            out.println("Mishka");
        else
            out.println("Chris");
    }
}
