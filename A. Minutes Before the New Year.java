import java.util.Scanner;

public class NewYearCount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int h=sc.nextInt()*60,m=sc.nextInt();
            System.out.println(1440-h-m);
        }
    }
}
