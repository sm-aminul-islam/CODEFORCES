import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n<=2){
                System.out.println("1");
            }
            else {
                System.out.println(((n-3)/x)+2);
            }
        }
    }
}
