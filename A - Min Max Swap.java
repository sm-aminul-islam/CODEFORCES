import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }
           for(int j=0;j<n;j++){
               if(a[j]>b[j]){
                   int temp=a[j];
                   a[j]=b[j];
                   b[j]=temp;
               }
           }
            Arrays.sort(a);
           Arrays.sort(b);
            System.out.println(a[a.length-1]*b[b.length-1]);
        }
    }
}
