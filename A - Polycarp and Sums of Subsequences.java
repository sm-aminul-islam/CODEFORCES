import java.util.Scanner;
public class Polycarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int arr[] = new int[7];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println(arr[0]+" "+arr[1]+" "+(max-(arr[0]+arr[1])));
        }
    }
}
