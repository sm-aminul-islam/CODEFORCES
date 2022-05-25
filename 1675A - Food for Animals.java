import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
            if(Math.max(0,(x-a))+Math.max(0,(y-b)) <=c){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
         }
    }
}
