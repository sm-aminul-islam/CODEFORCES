import java.util.Scanner;

public class Peter
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt(),x=sc.nextInt(),count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int mask=0;mask<(Math.pow(2,n));mask++){
            long sum=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            if(Integer.bitCount(mask)>=2) {
                for (int i = 0; i < n; i++) {
                   if((mask & (1<<i))>=1){
                       sum+=arr[i];
                       if(arr[i]>=max){
                           max=arr[i];
                       }
                       if(arr[i]<=min){
                           min=arr[i];
                       }
                   }
                }
            }
            if(sum>=l && sum<=r && (max-min)>=x){
                count++;
            }
        }
        System.out.println(count);
    }
}
