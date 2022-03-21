import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        if(n>m){
            int temp=n;
            n=m;
            m=temp;
        }
        if((n&1)==0){
            System.out.println("Malvika");
        }
        else {
            System.out.println("Akshat");
        }

    }
}
