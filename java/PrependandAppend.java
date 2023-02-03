package CompetitiveCodingCodeforces.java;

import java.util.*;

public class PrependandAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int i,j;
            for (i = 0,j = n-1; i < n; i++,j--) {
                if(i > n/2)
                    break;
                if(str.charAt(i) == str.charAt(j))  
                    break;
            }
            int minlength = n-(2*i);
            System.out.println(minlength<0?0:minlength);
        }
    }
}
