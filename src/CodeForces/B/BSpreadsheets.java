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
//        char[] arr = new char[27];
//
//        for (int i = 1; i <=26 ; i++) {
//            arr[i] = (char) (i+64);
//        }

//        for (char c : arr)
//            out.print(c + " ");
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
                Arrays.sort(strings, Collections.reverseOrder());

                        int col = Integer.parseInt(strings[0]);
                        int a = col / 26;
                        int b = col % 26;
                        sb.append(list.get(a-1)).append(list.get(b-1));
                        sb.append(strings[1]);

                out.println(sb);
            }
            else {
                String[] strings = st1.split("[1-9]");
                String[] intStr = st1.split("[A-Z]");
                Arrays.sort(intStr, Collections.reverseOrder());

                char[] chars = strings[0].toCharArray();
                int v = (list.indexOf(chars[0])+1) * 26 + list.indexOf(chars[1])+1;
                sb.append("R").append(intStr[0]).append("C").append(v);
                out.println(sb);
            }
        }
    }
}
