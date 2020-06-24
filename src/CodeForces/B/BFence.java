package CodeForces.B;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BFence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int sum;
        int ans = 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder test = new StringBuilder();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i<= n - k; i++) {
            sum = 0;
            for (int p = 0; p < k; p++) {
                sum += arr[i + p];
            }

            if (min > sum) {
                min = sum;
                ans = i;
            }
        }
        stringBuilder.append(ans + 1);

        out.println(stringBuilder.toString());
    }
}
