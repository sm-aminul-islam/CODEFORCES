import java.util.*;
public class CodeForces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
        for(int j=0;j<n;++j){
            System.out.print((j+1)%n+1 +" ");
        }
            System.out.println();
        }
    }
}
