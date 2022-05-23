import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         while(t-->0){
             int l1=sc.nextInt(),r1=sc.nextInt(),l2=sc.nextInt(),r2=sc.nextInt();
             if(Math.max(l1,l2)<=Math.min(r1,r2)){
                 System.out.println(Math.max(l1,l2));
             }
             else {
                 System.out.println(l1+l2);
             }

         }
    }
}
