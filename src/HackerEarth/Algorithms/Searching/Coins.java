package HackerEarth.Algorithms.Searching;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Coins
 *
 *link : https://www.hackerearth.com/problem/algorithm/coins-11/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class Coins {
    int sumMin(int[] arr, int k){
        int sum = 0;
        int index = 0;

        do {
            if (arr[index] >= k)
                break;
            sum += arr[index];
            index++;
        }while (true);

        return sum;
    }

    int sumMax(int[] arr, int k){
        int sum = 0;
        int index = arr.length - 1;

       do {
           if (arr[index] <= k)
               break;

           sum += arr[index];
           index--;
       }while (true);

       return sum;
    }

    int binarySearch(int[] arr){
        int length = arr.length;
        int high = arr[length-1];
        int low = arr[0];
        int ans = 0;
        int mid, minSum, maxSum;

        while (low <= high){
             mid = (low+high) >> 1;
             minSum = sumMin(arr, mid);
             maxSum = sumMax(arr, mid);

            if (minSum == maxSum && (minSum != 0 && maxSum != 0)){
                ans = 1;
                break;
            }else if (minSum < maxSum)
                low = mid+1;
            else
                high = mid-1;
        }
        return ans;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        if (binarySearch(arr) == 1)
            out.println("YES");
        else
            out.println("NO");
    }
}
