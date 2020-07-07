package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Bus to Udayland
 *
 * link : https://codeforces.com/problemset/problem/711/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABusToUdayland {

    boolean firstPair(String string) {
        String[] str = string.split("");
        return (str[0].equals("O") && str[1].equals("O"));
    }
    String seatFirstPair(String string) {
            string = "++" + string.substring(2, string.length());

        return string;
    }

    boolean secondPair(String string) {
        String[] str = string.split("");
        return (str[3].equals("O") && str[4].equals("O"));
    }

    String seatSecondPair(String string) {
        string =  string.substring(0, 3) + "++" ;

        return string;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
            String[] str = new String[n];
            StringBuilder sb = new StringBuilder();
            boolean flag = false;

        for (int i = 0; i < n; i++) {
            str[i] = in.next();

        }

        for (int i = 0; i < n; i++) {
            if (firstPair(str[i])){
                str[i] = seatFirstPair(str[i]);
                flag = true;
                break;
            }

            else if (secondPair(str[i])) {
                str[i] = seatSecondPair(str[i]);
                flag = true;
                break;
            }
        }
       if (flag) {
           out.println("YES");
           for (String s : str)
               out.println(s);
       }
       else
           out.println("NO");


    }
}
