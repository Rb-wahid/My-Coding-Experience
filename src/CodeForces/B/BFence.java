package CodeForces.B;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BFence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int[] sumArray = new int[n+1];
        int sum = 0;
        int ans = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            sum += arr[i-1];
            sumArray[i] = sum;
        }


        for (int i = k; i <= n; i++) {

                sum = sumArray[i] - sumArray[i - k];
                if (min > sum) {
                    min = sum;
                    ans = i-k;
                }

        }
        stringBuilder.append(ans + 1);

        out.println(stringBuilder.toString());
    }
}
