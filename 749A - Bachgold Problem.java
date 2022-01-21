import java.util.Scanner;

public class Bachgold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1){
            n=n/2;
            n--;
            System.out.println((n+1)+" "+"3");
        }
        else {
            n=n/2;
            System.out.println(n);
        }
        for(int i=0;i<n;i++){
            System.out.print("2"+" ");
        }
    }
}
