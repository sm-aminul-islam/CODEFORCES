import java.util.Scanner;

public class VanyaAndCubesa{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,height=0;
        while(count<=n){
            height++;
            count+=(height*(height+1))/2;
        }
        System.out.println(height-1);
    }
}
