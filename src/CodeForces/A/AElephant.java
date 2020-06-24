package CodeForces.A;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AElephant {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x = in.nextInt();
        out.println((int) Math.ceil(x/5.0));
    }
}
