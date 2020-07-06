package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Beautiful Year
 *
 * link : https://codeforces.com/problemset/problem/271/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class ABeautifulYear {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int year = in.nextInt();
        String str;
        Set<Character> set;
        int i = year+1;
        while (true){
            str = String.valueOf(i);
            set = new HashSet<>();
            for (int j = 0; j < str.length(); j++) {
                set.add(str.charAt(j));
            }

            if (set.size() != str.length())
                i++;
            else
                break;
        }

        out.println(str);
    }
}
