import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
           int count=0, c=0;
           while(count<=n){
               if(a>b){
                   b+=a;
                   count=b;
                   c++;
               }
               else{
                   a+=b;
                   count=a;
                   c++;
               }
               if(count>n){
                   break;
               }
           }
            System.out.println(c);
        }

    }
}
