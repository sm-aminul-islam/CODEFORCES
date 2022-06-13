import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         while(t-->0) {
             int n=sc.nextInt();
             int m=sc.nextInt();
             int arr[]=new int[n+1];
             int sum=0;
             for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
                 sum+=arr[i];
             }
             if(m>sum){
                 System.out.println("0");
             }
             else {
                 System.out.println(sum-m);
             }
         }
    }
}
