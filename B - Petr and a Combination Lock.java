import java.util.Scanner;

public class Peter
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int mask=0;mask<(1<<n);mask++){
            int anti=0,clock=0;
            for(int i=0;i<n;i++){
                if((mask & (1<<i))>=1){
                    anti-=arr[i];
                }
                else {
                    clock+=arr[i];
                }
            }
            if((clock+anti)%360==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
