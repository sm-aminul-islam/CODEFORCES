import java.util.Scanner;

public class ShortSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            StringBuilder sb=new StringBuilder(sc.next());
            System.out.println(sb.length());

        }
    }
}
