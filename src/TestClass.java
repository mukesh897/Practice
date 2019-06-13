import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String S = br.readLine();

        int out_ = SmallestSubString(S);
        wr.println(out_);

        wr.close();
        br.close();
    }

    static int SmallestSubString(String S) {
        // Write your code here

        int n = S.length();     // size of given string

        // Initialize all character's count with 0
        int count[] = new int[256];

        // Increase the count in array if a character
        // is found
        for (int i = 0; i < n; i++) {
            count[S.charAt(i)]++;
        }

        int max_distinct = max_char(S, S.length());

        int min = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                String subs = null;
                if(i<j)
                    subs = S.substring(i, j);
                else
                    subs = S.substring(j, i);
                int subs_lenght = subs.length();
                int sub_distinct_char = max_char(subs, subs_lenght);

                if (subs_lenght < min && max_distinct == sub_distinct_char) {
                    min = subs_lenght;
                }
            }
        }
        return min;

    }

    static int max_char(String str, int n) {
        int count[] = new int[256];

        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        int max_distinct = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                max_distinct++;
            }
        }

        return max_distinct;
    }
}