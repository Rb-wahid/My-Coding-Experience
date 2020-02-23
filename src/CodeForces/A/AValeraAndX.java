package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Valera and X
 *
 * link : http://codeforces.com/contest/404/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AValeraAndX {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int length = in.nextInt();
        char[][] ch = new char[length][length];
        boolean flag = true;
        char first, second;
        String str ;
        for (int i = 0; i < length; i++) {
            str = in.readLine();

            for (int j = 0; j < length; j++) {
                ch[i][j] = str.charAt(j);
                first = ch[0][0];
                second = ch[0][1];

                if (i == j){
                    if (first != ch[i][j])
                        flag = false;
                }else if (i == length-1-j){
                    if (first != ch[i][j])
                        flag = false;
                }else {
                    if (first == ch[i][j] || second != ch[i][j])
                        flag = false;
                }
            }
            if (!flag)
                break;
        }

        out.println(flag ? "YES" : "NO");
    }
}
