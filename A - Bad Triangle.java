import java.util.*;
public class Domino {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt(),flag=0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]+arr[i+1]<=arr[n-1]) {
                    System.out.println((i+1)+" "+(i+2)+" "+" "+(n));
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("-1");
            }
        }

    }
}
