package Algorithms.Warmup;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Diagonal Difference
 *
 *link : https://www.hackerrank.com/challenges/diagonal-difference/problem
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class DiagonalDifference {
    public void solve(int testNumber, InputReader in, OutputWriter out) {


           int size = in.nextInt();
           int leftDiagonal = 0;
           int rightDiagonal = 0;
           int[][] arr = new int[size][size];
           int mid = (int)(size/2);

           for (int row = 0;row < size; row++){
               for (int column = 0;column < size;column++){
                   arr[row][column] = in.nextInt();

                   if(row == column)
                       leftDiagonal += arr[row][column];
                   if (row == size-column-1)
                       rightDiagonal += arr[row][column];


               }
           }

           out.println(Math.abs(leftDiagonal-rightDiagonal));

    }
}
