package CodeForces.C;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: C. Move Brackets
 *
 * link : https://codeforces.com/contest/1374/problem/C
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class CMoveBrackets {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-->0){
            int n = in.nextInt();
            String str = in.next();

           int open = 0;
           int ans = 0;

           for (char ch : str.toCharArray()) {
               if (ch == '('){
                   open++;
               }
               else {
                   if (open > 0)
                       open--;
                   else
                       ans++;
               }
           }
           out.println(ans);
        }
    }
}
