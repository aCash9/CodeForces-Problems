package CompetitiveCodingCodeforces.java;

import java.util.*;

public class FlipFlopSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] == -1 && a[i] == -1) {
                    a[i - 1] = 1;
                    a[i] = 1;
                    break;
                }
            }
            
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            System.out.println(sum);
        }
    }
}
