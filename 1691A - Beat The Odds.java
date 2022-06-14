import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         while(t-->0) {
             int n=sc.nextInt();
            int arr[]=new int[n];
            int oddCount=0,evenCount=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    evenCount++;
                }
                else {
                    oddCount++;
                }
            }

             System.out.println(Math.min(evenCount,oddCount));
         }
    }
}
