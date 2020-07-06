package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. cAPS lOCK
 *
 * link : https://codeforces.com/problemset/problem/131/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACAPSLOCK {

    boolean isAllUpperCase(String string) {
        String str = string.toUpperCase();

        return str.equals(string);
    }

    boolean upperCaseWithoutFirst(String string) {
        String withoutFirst = string.substring(1, string.length());
        String afterUpperCase = withoutFirst.toUpperCase();

        return withoutFirst.equals(afterUpperCase);
    }

    String opration(String string) {
        string = string.toLowerCase();
        String first = String.valueOf(string.charAt(0));
        string = string.replaceFirst(first, first.toUpperCase());

        return string;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.next();

        if (isAllUpperCase(str) || upperCaseWithoutFirst(str))
        out.println(opration(str));
        else
            out.println(str);
    }
}
