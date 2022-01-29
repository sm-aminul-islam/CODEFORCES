
import java.util.Scanner;

public class NightMusium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum = 0;
        char last = 'a';
        for(int i = 0; i < s.length(); i++){
            sum+= Math.min(Math.abs(s.charAt(i)-last), (26-Math.abs(s.charAt(i)-last)));
            last = s.charAt(i);
        }
        System.out.println(sum);


    }
}
