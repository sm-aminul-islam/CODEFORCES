import java.util.Arrays;
import java.util.Scanner;
public class RestoringNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0;  i < 3; i++){
            System.out.print(arr[3]-arr[i]+" ");
        }
    }
}
