package CompetitiveCodingCodeforces.java;

import java.util.*;

public class FollowingDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[] d = new char[n];
            int x = 0 , y= 0,c=0;
            for (int i = 0; i < n; i++) {
                d[i] = sc.next().charAt(0);
                if(d[i] == 'U')
                    x += 1;
                else if(d[i] == 'D')
                    x -= 1;
                else if(d[i] == 'L')
                    y -= 1;
                else if(d[i] == 'R')
                    y += 1;

                if(x == 1 && y == 1) 
                    c++;
            }
            if(c!=0)
                System.out.println("Yes");
            else 
                System.out.println("No");
        }
    }
}
