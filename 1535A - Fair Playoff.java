
import java.util.Scanner;

public class OrdinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
            if(Math.min(a,b)>Math.max(c,d)||Math.max(a,b)<Math.min(c,d)){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }

        }


    }
}
