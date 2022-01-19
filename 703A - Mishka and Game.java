import java.util.Scanner;

public class Miska {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,x=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b)
                count++;
            else if(a<b){
                x++;
            }

        }
        if(count>x)
        {
            System.out.println("Mishka");
        }
        else if(count<x){
            System.out.println("Chris");
        }
        else {
            System.out.println("Friendship is magic!^^");
        }

    }
}
