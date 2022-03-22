import java.util.Scanner;
public class Polycarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            double x=Math.sqrt((a*a)+(b*b));
            if((int)x==0){
                System.out.println("0");
            }
            else if((int)x/x==1){
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }
        }
    }
}
