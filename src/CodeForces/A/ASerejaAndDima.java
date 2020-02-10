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
        int Sereja = 0, Dima = 0;
        if ((numberOfCard & 1) == 1){
            for (int i = 0; i < numberOfCard; i += 2) {
                Sereja += cards[i];
            }
            for (int i = 1; i < numberOfCard; i += 2) {
                Dima += cards[i];
            }
        }else {
            for (int i = 0; i < numberOfCard>>1; i++) {
                Sereja += cards[i];
            }
            for (int i = numberOfCard>>1; i < numberOfCard; i++) {
                Dima += cards[i];
            }
        }

        out.println(Sereja + " " + Dima);
    }
}
