package CompetitiveCodingCodeforces.java;

import java.util.*;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String ch = sc.next();
            String str = "codeforces";
            if (str.contains(ch))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
