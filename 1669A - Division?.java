

import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int X=sc.nextInt();
            if(X>=1900){
                System.out.println("Division 1");
            }
            else if(X>=1600 && X<=1899){
                System.out.println("Division 2");
            }
            else if(X>=1400 && X<=1599){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
            
        }
        

    }
}
