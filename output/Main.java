import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Rb_wahid
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        BSpreadsheets solver = new BSpreadsheets();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSpreadsheets {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            List<Character> list = new ArrayList<>();

            for (int i = 65; i <= 90; i++) {
                list.add((char) i);
            }
            int t = in.nextInt();

            while (t-- > 0) {
                StringBuilder sb = new StringBuilder();
                String st1 = in.nextString();
                if (st1.charAt(0) == 'R') {
                    String[] strings = st1.split("[RC]");
                    int a = 0;
                    int b = 0;
                    for (String s : strings) {
                        if (!s.trim().isEmpty() && a == 0)
                            a = Integer.parseInt(s);
                        else if (!s.trim().isEmpty() && b == 0)
                            b = Integer.parseInt(s);
                    }
                    int col = b;

                    if (col > 26) {
                        a = col / 26;
                        b = col % 26;
                        sb.append(list.get(a - 1)).append(list.get(b - 1));
                        sb.append(strings[1]);
                    } else {
                        sb.append(list.get(col - 1)).append(strings[1]);
                    }

                } else {
                    String forInt = st1.replaceAll("[A-Z]", "");
                    String forStr = st1.replaceAll("[1-9]", "");

                    if (forStr.length() == 1) {
                        int v = list.indexOf(forStr.charAt(0)) + 1;
                        sb.append("R").append(forInt).append("C").append(v);
                    } else {
                        char[] chars = forStr.toCharArray();
                        int v = (list.indexOf(chars[0]) + 1) * 26 + list.indexOf(chars[1]) + 1;
                        sb.append("R").append(forInt).append("C").append(v);
                    }
                }
                out.println(sb);
            }
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

