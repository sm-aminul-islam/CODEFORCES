import java.util.*;

public class CodeForces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


            int n=sc.nextInt();
           if(n%2!=0){
               System.out.println("-1");
           }
           else {
               for (int j = 1; j <= n; j++) {
                   System.out.print(j + " ");
               }

           }
    }
}
