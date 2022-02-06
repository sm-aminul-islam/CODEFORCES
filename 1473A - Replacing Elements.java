
import java.util.Arrays;
import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt(),d=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]+arr[1]<=d ||arr[n-1]<=d){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }

    }
}
