package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Sereja and Dima
 *
 *link : https://codeforces.com/contest/381/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ASerejaAndDima {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int numberOfCard = in.nextInt();
        int[] cards = new int[numberOfCard];
        int Sereja = 0, Dima = 0, person = 0, low = 0, high = numberOfCard-1, max = 0;

        for (int i = 0; i < numberOfCard; i++) {
            cards[i] = in.nextInt();
        }

        while (low <= high){
            if (cards[high] > cards[low]){
                max = cards[high];
                high--;
            }else {
                max = cards[low];
                low++;
            }

            if ((person & 1) == 0)
                Sereja += max;
            else
                Dima += max;
            person++;
        }

        out.println(Sereja + " " + Dima);

    }
}
