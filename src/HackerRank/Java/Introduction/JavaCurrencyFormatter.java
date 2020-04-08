package HackerRank.Java.Introduction;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: Java Currency Formatter
 *
 * link : https://www.hackerrank.com/challenges/java-currency-formatter/problem
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public void solve(int testNumber, InputReader in, OutputWriter out) {

        double payment = in.nextDouble();


        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        out.println("US: "     + us.format(payment));
        out.println("India: "  + india.format(payment));
        out.println("China: "  + china.format(payment));
        out.println("France: " + france.format(payment));


    }
}
