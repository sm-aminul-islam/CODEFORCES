import java.util.Arrays;
import java.util.Scanner;
public class Puzzles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),count=0,ans=0;
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        count =arr[m-1]-arr[0];
        for(int i=n;i<=m;i++){
            ans=arr[i-1]-arr[i-n];
            ans=Math.abs(ans);
            count=Math.min(count,ans);
        }
        System.out.println(count);
    }
}
