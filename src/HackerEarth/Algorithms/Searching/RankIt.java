package HackerEarth.Algorithms.Searching;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Rank It
 *
 *link : https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/searching-content-problem/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class RankIt {

    int binarySearch(int[] arr, int key){
        int low = 0,high = arr.length;
       while (low <= high){
           int mid = (low + high) >> 1;
           if (arr[mid] < key)
               low = ++mid;
           else if (arr[mid] > key)
               high = --mid;
           else
               return ++mid;
       }
        return key;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int q = in.nextInt();
        while (q-->0){
            int n = in.nextInt();
            out.println(binarySearch(arr, n));
        }
    }
}
