
import java.util.Scanner;

public class SerijaDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, d = 0;
        int left=0,right=n-1;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                if(arr[right]>arr[left]){
                    s+=arr[right];
                    --right;
                }
                else if(arr[right]<arr[left]){
                    s+=arr[left];
                    ++left;
                }
                else {
                    s+=arr[left];
                }
            }
            else { if(arr[right]>arr[left]){
                d+=arr[right];
                --right;
            }
            else if(arr[right]<arr[left]){
                d+=arr[left];
                ++left;
            }
            else {
                d+=arr[left];
            }

            }

    }
        System.out.println(s+" "+d);
}
}
