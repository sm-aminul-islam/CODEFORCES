import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                b[j]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int sum=0,count=0;
           for(int i=0;i<k;i++){
               if(a[i]<=b[n-1-i]){
               int temp=a[i];
               a[i]=b[n-1-i];
               b[n-1-i]=temp;
               }
           }
           for(int i=0;i<n;i++){
               sum+=a[i];
          
           }
            System.out.println(sum);
           
        }
    }
    
}
