package CompetitiveCodingCodeforces.java;

import java.util.*;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1 );
            }
            
        }
    }
}
