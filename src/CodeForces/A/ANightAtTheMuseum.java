package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Night at the Museum
 *
 *link : https://codeforces.com/contest/731/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANightAtTheMuseum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.nextString();
        str = "a"+ str;
        char[] ch = str.toCharArray();
        int ans = 0;
        for (int i = 0; i < ch.length - 1;i++ ){
            int a = ch[i];
            int b = ch[i+1];

            if (a < b){
                int max = (a+26) - b;
                int min = b - a;
                if(min < max)
                    ans += min;
                else
                    ans += max;

            } if(a> b){
                int max = (b+26) - a;
                int min = a - b;
                if(max < min)
                    ans += max;
                else
                    ans += min;
            }
        }

           out.println(ans);
    }
}
