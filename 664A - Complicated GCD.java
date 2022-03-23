import java.util.Objects;
import java.util.Scanner;

public class Gcd {
    static  String gcd(String s,String s1){
        if(Objects.equals(s, s1))return s;
        return "1";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),s1=sc.next();
        System.out.println(gcd(s,s1));
    }
}
