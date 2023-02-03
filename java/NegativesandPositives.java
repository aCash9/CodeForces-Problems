package CompetitiveCodingCodeforces.java;

import java.util.*;

public class NegativesandPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> l = new ArrayList<>();
            int iSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] =sc.nextInt();
                iSum += a[i];
                if(a[i] < 0)
                    l.add(i);
            }
            int maxSum = iSum;
            for(int i : l){
                if(i == n-1)
                    break;
                int tSum = iSum - (a[i] + a[i+1]);
                int cSum = tSum + (-a[i] - a[i+1]);
                if(cSum > maxSum)
                    maxSum = cSum;
            }
            System.out.println(maxSum);
        }
    }
}
