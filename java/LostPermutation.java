package CompetitiveCodingCodeforces.java;

import java.util.*;
public class LostPermutation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int m =sc.nextInt();
            int s =sc.nextInt();
            while(m>0){
                int n = sc.nextInt();
                set.add(n);
                m--;
            }
            int sum=0;
            int i =1;
            while(sum<s){
                if(!set.contains(i)){
                    set.add(i);
                    sum+=i;
                }
                i++;
            }
            for (int j = 1; j <= set.size(); j++) {
                if(!set.contains(j)){
                    System.out.println("NO");
                    set.clear();
                    return;
            }
        }
            if(sum==s)
                System.out.println("YES");
            else 
                System.out.println("NO");
            
            set.clear();
            t--;
        }
    }
}
