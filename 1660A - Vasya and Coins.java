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
            int a=sc.nextInt(),b=sc.nextInt();
            if(a==0){
                System.out.println("1");
            }
            else{
                System.out.println(a+2*b+1);
            }
        }

    }
}
