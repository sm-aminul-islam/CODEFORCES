import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         while(t-->0) {
             int n=sc.nextInt();
             int x=sc.nextInt();
             int odd=0,even=0;
             int arr[]=new int[n];
             for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
                 if(arr[i]%2==0){
                     even++;
                 }
                 else {
                     odd++;
                 }
             }
             int m=Math.min(even,x-1);
             int d=x-m;
             if(d%2==0){
                 d++;
             }
             if(odd>=d && d<=x){
                 System.out.println("YES");
                 }
             else {
                 System.out.println("NO");
             }
         }
    }
}
