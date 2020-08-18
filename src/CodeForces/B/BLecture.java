package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Lecture
 *
 * link : https://codeforces.com/problemset/problem/499/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BLecture {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        Map<String, String> map = new HashMap<>();
        String[] str = new String[n];
        StringBuilder sb = new StringBuilder();
        String a ;
        String b ;

        for (int i = 0; i <m ; i++) {
           a = in.next();
           b = in.next();

           map.put(a, a.length() <= b.length()? a : b);
        }
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
            sb.append(map.get(str[i])).append(" ");
        }
        out.println(sb);
    }
}
