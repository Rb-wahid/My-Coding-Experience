package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title:
 *
 * link :
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BWorms {

    int binarySearch(int[] arr, int key) {
        int high = arr.length;
        int low = 0;
        int mid = 0;

        while (low < high) {
            mid = (high+low)/2;
            if (arr[mid] <= key)
                low = mid+1;
            else
                high = mid;
        }

        return low;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        int[] newArray = new int[n+1];
        newArray[0] = 0;
        newArray[1] = arr[0];
        for (int i = 1; i < n; i++) {
            newArray[i+1] = newArray[i]+arr[i];
        }

//        for (int i : newArray)
//            out.print(i + " ");
//        out.println();
        int m = in.nextInt();

        while (m-->0) {
            int q = in.nextInt();
            int v = binarySearch(newArray, q);
           // out.println(v);
            out.println(v > n? v-1 : v);
        }
    }
}
