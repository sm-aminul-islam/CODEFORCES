import java.util.Scanner;

public class OrdinaryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count =0;
            for (int i=1;i<=n;i=i*10+1){
                for(int j=1;j<=9;j++){
                    if(i*j<=n){
                        count++;
                    }
                }
            }
            System.out.println(count);

        }
    }
}
