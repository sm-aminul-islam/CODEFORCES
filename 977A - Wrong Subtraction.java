import java.util.Scanner;

public class wrongSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t= sc.nextInt();
        int count=0;
        for(int i=0;i<t;i++){
            if(n%10==0){
                n=n/10;
                continue;

            }
            n--;
            count++;
        }
        System.out.println(n);
    }

}
