package UVA;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: 10110 - Light, more light
 *
 *link : https://onlinejudge.org/index.php?Itemid=8&option=com_onlinejudge&page=show_problem&problem=1051
 */
import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class LightMoreLight {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        while (true) {
            int n = in.nextInt();
            if (n == 0)
                break;
            int value = (int) Math.sqrt(n);
           String str = value*value == n ? "yes" : "no";
           out.println(str);
        }
    }
}
