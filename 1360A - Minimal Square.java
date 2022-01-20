import java.util.Scanner;

public class MinumalSqure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            if(min+min>max){
                System.out.println((int)Math.pow(min+min,2));
            }
            else {
                System.out.println((int)Math.pow(max,2));
            }
        }
    }
}
