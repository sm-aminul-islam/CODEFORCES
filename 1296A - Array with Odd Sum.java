import java.util.Scanner;

public class SumofOddArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int sum=0;
            boolean odd=false,even=false;
            for(int j=0;j<n;j++){
               sum=sum+arr[j];
               odd|=arr[j]%2!=0;
               even|=arr[j]%2==0;
            }
            if(sum%2!=0||(odd && even)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
