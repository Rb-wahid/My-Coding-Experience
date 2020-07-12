package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Nineteen
 *
 * link : https://codeforces.com/problemset/problem/393/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class ANineteen {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String string = in.next();
        List<Integer> set = new ArrayList<>();
        char[] arr = string.toCharArray();

        int n = 0;
        int ii = 0;
        int e = 0;
        int t = 0;

        for (char c : arr) {
            if (c == 'n')
                n++;
            else if (c == 'i')
                ii++;
            else if (c == 'e')
                e++;

            else if (c == 't')
                t++;
        }
        set.add((n-1)/2);
        set.add(ii);
        set.add(e/3);
        set.add(t);


        Collections.sort(set);

        out.println(set.get(0));

    }
}
