import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int count =0;
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        if(arr.length==1){
            System.out.println("0");
            return;
        }
        Arrays.sort(arr);
        max=arr[n-1];
        for(int i=0;i<arr.length;i++){

          count+=(max-arr[i]);
        }
        System.out.println(count);

    }

}
