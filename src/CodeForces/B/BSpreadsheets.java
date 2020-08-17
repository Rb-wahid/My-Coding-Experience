package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Spreadsheets
 *
 * link : https://codeforces.com/problemset/problem/1/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BSpreadsheets {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        List<Character> list = new ArrayList<>();

        for (int i = 65; i <= 90 ; i++) {
            list.add((char)i);
        }
        int t = in.nextInt();

        while (t-->0) {
            StringBuilder sb = new StringBuilder();
            String st1 = in.nextString();
            if (st1.charAt(0) == 'R') {
                String[] strings = st1.split("[RC]");
                int a = 0;
                int b = 0;
                for (String s: strings){
                    if (!s.trim().isEmpty() && a == 0)
                        a = Integer.parseInt(s);
                    else if (!s.trim().isEmpty() && b == 0)
                        b = Integer.parseInt(s);
                }
                int col = b;

                if (col > 26) {
                     a = col / 26;
                     b = col % 26;
                    sb.append(list.get(a - 1)).append(list.get(b - 1));
                    sb.append(strings[1]);
                }
                else {
                    sb.append(list.get(col-1)).append(strings[1]);
                }

            }
            else {
                String forInt = st1.replaceAll("[A-Z]", "");
                String forStr = st1.replaceAll("[1-9]", "");

                if (forStr.length() == 1){
                     int v = list.indexOf(forStr.charAt(0))+1 ;
                     sb.append("R").append(forInt).append("C").append(v);
                     }
                else {
                    char[] chars = forStr.toCharArray();
                    int v = (list.indexOf(chars[0]) + 1) * 26 + list.indexOf(chars[1]) + 1;
                    sb.append("R").append(forInt).append("C").append(v);
                }
            }
            out.println(sb);
        }
    }
}
