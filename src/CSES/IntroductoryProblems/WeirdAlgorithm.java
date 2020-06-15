package CSES.IntroductoryProblems;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class WeirdAlgorithm {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long num = in.nextInt();

        while (true) {
            out.print(num + " ");
            if (num == 1)
                break;
            if ((num&1) == 0)
                num /= 2;
            else
                num = num * 3 +1;
        }
    }
}
