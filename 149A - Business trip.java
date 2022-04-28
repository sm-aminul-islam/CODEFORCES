import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int arr[] = new int[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        /*for(int i=0;i<12;i++){
			System.out.println(arr[i]);
		}*/

        if (k == 0) {
            System.out.println("0");
            System.exit(0);
        }

        int sum = 0, count = 0;
        int flag = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            count++;

            if (sum >= k) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }

}
