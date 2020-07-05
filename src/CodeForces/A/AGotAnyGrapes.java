package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Got Any Grapes?
 *
 * link : http://codeforces.com/problemset/problem/1114/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGotAnyGrapes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int Andrew = in.nextInt();
        int Dmitry = in.nextInt();
        int Michal = in.nextInt();

        int green = in.nextInt();
        int purple = in.nextInt();
        int black = in.nextInt();
        boolean flag = true;


        if (Andrew > green)
            flag = false;
        else {
            green -= Andrew;
        }
        if (Dmitry > (green+purple))
            flag = false;
        else {
            while (Dmitry-- != 0){
                if (green > 0)
                    green--;
                else {
                    if (purple > 0)
                    purple--;
                }

            }
        }


        if (Michal > (green+purple+black))
            flag = false;

        if (flag)
            out.println("YES");
        else
            out.println("NO");
    }
}
