import java.util.Scanner;
public class EvenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int even=0,odd=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2!=i%2){
                    if(i%2==0){
                        even++;
                    }
                    else {
                        odd++;
                    }
                }
            }
            if(even!=odd){
                System.out.println("-1");
            }
            else {
                System.out.println(even);
            }
        }

    }
}
