package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. New Year and Naming
 *
 * link : https://codeforces.com/problemset/problem/1284/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANewYearAndNaming {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();
        int m = in.nextInt();

        String s = in.readLine();
        String t = in.readLine();

        String[] strings = s.split(" ");
        String[] stringsT = t.split(" ");

        int q = in.nextInt();

        while (q-->0) {
            long year = in.nextLong();
            int indexS =(int) year % n;
            int indexT =(int) year % m;

            if (indexS != 0 ) {
                if (indexT != 0)
                out.println(strings[indexS - 1] + stringsT[indexT - 1]);
                else
                    out.println(strings[indexS - 1] + stringsT[stringsT.length-1]);

            }
            else if (indexT != 0) {
                    out.println(strings[strings.length - 1] + stringsT[indexT - 1]);

            }
            else
                out.println(strings[strings.length-1] + stringsT[stringsT.length-1]);
        }
    }
}
