import java.util.Scanner;

public class AddOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a == b) {
                System.out.println("0");
            }
            else if(a>b &&(a-b)%2==0 || a<b && (b-a)%2!=0){
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }
        }
    }
}
