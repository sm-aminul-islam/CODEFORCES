import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int flag=0;
            int a[] = new int[2*n];

            for (int j = 0; j < (2 * n);j++ )
            {
                a[j]=sc.nextInt();
            }
            for(int j=0;j<(2*n);j++){
               if(a[j]%2!=0){
                   flag++;
                 }
            }
            if(flag==n){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


        }

    }
}
