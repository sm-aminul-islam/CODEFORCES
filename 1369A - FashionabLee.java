import java.util.Scanner;

public class MaximumInTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n%4==0 || n%12==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
