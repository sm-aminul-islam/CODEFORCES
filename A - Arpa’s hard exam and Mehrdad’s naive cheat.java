import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []array={6,8,4,2};
        int n=sc.nextInt();
        if(n==0){
            System.out.println("1");
        }
        else {
            int index = n % 4;
            System.out.println(array[index]);
        }
    }
}
