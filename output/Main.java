import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author Rb_wahid
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		AJeffAndDigits solver = new AJeffAndDigits();
		solver.solve(1, in, out);
		out.close();
	}
static class AJeffAndDigits   {
public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        int f = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if (arr[i] == 5)
                f++;
            else
                z++;
        }
        Arrays.sort(arr);
        StringBuilder string = new StringBuilder();


        for (int i = n-1; i >= 0; --i)
            string.append(arr[i]);

        String str = string.toString();
        long value = Long.parseLong(str);
        long temp = 0;

        while (value % 90 != 0 && value != 5 ) {

                temp = value -  ( 5 *(long) Math.pow(10, n-1));
                if (temp % 90 == 0){
                    value = temp;
                    break;
                }
                else {
                    str = str.substring(0, n-1);
                    --n;
                    if (str.length() != 0) {
                        temp = Long.parseLong(str);
                        if (temp % 90 == 0) {
                            value = temp;
                            break;
                        }
                    } else {
                        value = 5;
                    }
                }
        }
        if (z == 0)
            out.println(-1);
        else if (value == 5 || f == 0)
            out.println(0);
        else
            out.println(value);
    }

}
static class OutputWriter   {
private   final PrintWriter writer;

public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

public void close() {
        writer.close();
    }

public void println(long i) {
        writer.println(i);
    }

public void println(int i) {
        writer.println(i);
    }

}
static class InputReader   {
private InputStream stream;
private byte[] buf = new byte[1024];
private int curChar;
private int numChars;
private InputReader.SpaceCharFilter filter;

public InputReader(InputStream stream) {
        this.stream = stream;
    }

public int read() {
        if (numChars == -1) {
            throw new InputMismatchException();
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }

public int nextInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

public boolean isSpaceChar(int c) {
        if (filter != null) {
            return filter.isSpaceChar(c);
        }
        return isWhitespace(c);
    }

public   static boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

public interface SpaceCharFilter   {
public boolean isSpaceChar(int ch);

}

}
}

