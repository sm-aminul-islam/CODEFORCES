import java.util.Scanner;

public class RepeatingChiper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=i;
            if(sum<n){
                System.out.print(s.charAt(sum));
            }
        }
    }
}
