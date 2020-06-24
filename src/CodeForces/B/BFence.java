package CodeForces.B;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BFence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int ans = 1;
        StringBuilder stringBuilder = new StringBuilder();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        if (n < 3)
            stringBuilder.append(ans);
        else {
            for (int i = 0; i < n - 2; i++) {
                sum = arr[i]+arr[i+1]+arr[i+2];
                if (min > sum){
                    min = sum;
                    ans = i;
                }
            }
            stringBuilder.append(ans+1);
        }
        out.println(stringBuilder.toString());
    }
}
