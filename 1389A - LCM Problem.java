import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           int l=sc.nextInt(),r=sc.nextInt();
           if(2*l>r){
               System.out.println("-1"+" "+"-1");
           }
           else{
               System.out.println(l+" "+(2*l));
           }
        }
        
    }
}
