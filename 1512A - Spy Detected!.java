import java.util.Arrays;
import java.util.Scanner;

public class Spydetected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int max=0;
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j  < n; j++){
                a[j] = sc.nextInt();
            }

            for(int j = 0; j < n; j++){
                int d = 0;
                for(int k = 0; k < n; k++){
                    if(a[j] == a[k]){
                        d++;
                    }
                }
                if(d == 1){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}
