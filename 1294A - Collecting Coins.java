import java.util.Scanner;

public class CollectingCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),n=sc.nextInt();
            int ans=a+b+c+n;
            if(ans%3!=0){
                System.out.println("NO");
                continue;
            }
            else {
                int p=ans/3;
                if(a<=p && b<=p && c<=p){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }

        }
    }
}
