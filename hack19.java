import java.io.*;
import java.util.*;

public class hack19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s, " !,?.@'_");

    int tokenCount = st.countTokens();
    System.out.println(tokenCount);

    while (st.hasMoreTokens()) {
        System.out.println(st.nextToken());
    }

        // Write your code here.
        
        scan.close();
    }
}

