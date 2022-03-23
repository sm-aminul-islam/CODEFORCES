import java.util.Arrays;
import java.util.Scanner;
public class Practice {
    static  int []  seive(int n){
        int arr[]=new int[n+1];
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i*i<=n;i++){

            for(int j=2*i;j<=n;j+=i){
                arr[j]=0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=seive(n);
       int flag=0;
       for(int i=2;i<=n;i++){
           int mid=n-i;
           if(arr[i]==1&&arr[mid]==1 && i>=2 &&mid<=2){
               System.out.println(i+" "+mid);
               flag=1;
               break;
           }
       }
       if(flag==0){
           System.out.println("-1");
       }
        }
    }

