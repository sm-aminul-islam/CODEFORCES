import java.util.Scanner;

public class CombinationLock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String s1=sc.next();
        int sum=0;
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(Character.toString(s.charAt(i)));
            int y=Integer.parseInt(Character.toString(s1.charAt(i)));
            sum+=Math.min(Math.abs(x-y),10-Math.abs(x-y));
        }
        System.out.println(sum);
    }
}
