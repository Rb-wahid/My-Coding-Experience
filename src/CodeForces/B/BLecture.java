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
        List<String> list = new ArrayList<String>();
        String[] input = new String[2];
        String[] str = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <m ; i++) {
           String s = in.readLine();
            list.add(s);
        }
//        for (String s : list)
//        out.print(s + " ");
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            for (String value : list) {
                String[] s = value.split(" ");
                String a = s[0];
                String b = s[1];
                if (a.equals(str[i]) || b.equals(str[i]))
                    sb.append(a.length() <= b.length() ? a : b).append(" ");
            }
        }
        out.println(sb);
    }
}
