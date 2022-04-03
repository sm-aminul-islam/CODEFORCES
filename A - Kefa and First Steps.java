import java.util.Scanner;
public class Kefa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count =1,Max=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                count++;
            }
            else {
                Max=Math.max(Max,count);
                count=1;
            }
            Max=Math.max(Max,count);
        }
        System.out.println(Max);


    }

}
