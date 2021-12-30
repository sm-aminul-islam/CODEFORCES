import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.replace("+","");
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
            if(i==arr.length-1)
            {
                continue;
            }
            System.out.print("+");
        }
    }
}
