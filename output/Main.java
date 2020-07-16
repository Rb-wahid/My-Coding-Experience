import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        ATwoSubstrings solver = new ATwoSubstrings();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoSubstrings {
        boolean abString(String string) {
            boolean ab = false, ba = false;
            char[] strings = string.toCharArray();

            for (int i = 0; i < strings.length - 1; ++i) {
                if (strings[i] == 'A' && strings[i + 1] == 'B' && !ab) {
                    ab = true;
                    i++;
                } else if (strings[i] == 'B' && strings[i + 1] == 'A' && ab) {
                    ba = true;
                }
            }
            return ba;
        }

        boolean baString(String string) {
            char[] strings = string.toCharArray();
            boolean ab = false, ba = false;
            for (int i = 0; i < strings.length - 1; ++i) {
                if (strings[i] == 'B' && strings[i + 1] == 'A' && !ba) {
                    ba = true;
                    i++;
                } else if (strings[i] == 'A' && strings[i + 1] == 'B' && ba) {
                    ab = true;
                }
            }

            return ab;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String string = in.next();

            if (abString(string))
                out.println("YES");
            else
                out.println(baString(string) ? "YES" : "NO");
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

