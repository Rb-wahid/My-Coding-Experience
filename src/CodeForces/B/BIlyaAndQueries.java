package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Ilya and Queries
 *
 * link : https://codeforces.com/problemset/problem/313/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BIlyaAndQueries {

    int forDot(String string, int a, int b) {
        char[] arr = string.toCharArray();
        int count = 0;

        for (int i = a; i < b; i++) {
            if (arr[i] == '.')
                count++;
        }
        return count;
    }

    int forHash(String string, int a, int b) {
        char[] arr = string.toCharArray();
        int count = 0;

        for (int i = a; i < b; i++) {
            if (arr[i] == '#')
                count++;
        }
        return count;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {

        String string = in.next();
        int m = in.nextInt();
        int dot = 0;
        int hash = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.')
                dot++;
        }

        hash = string.length()-dot;

        while (m-->0) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (hash >= dot)
                out.println(forHash(string, a-1, b-1));
            else
                out.println(forDot(string, a-1, b-1));

        }
    }
}
