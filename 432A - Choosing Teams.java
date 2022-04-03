import java.util.Scanner;

public class ChossingTeam {
    static  void Solution(int arr[],int n,int k){
        int count =0;
        for(int i=0;i<n;i++){
            if(5-arr[i]>=k){
                count++;
            }
        }
        System.out.println(count/3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution(arr,n,k);
    }
}
