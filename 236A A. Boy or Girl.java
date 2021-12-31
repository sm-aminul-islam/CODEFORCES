import java.util.Arrays;
import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        // int n=sc.nextInt();
        String s = sc.next();
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        //System.out.println(s1);
        for (int i = 0; i < s1.length-1; i++) {
            if (s1[i] != s1[i + 1]) {
                ++count;
            }
        }
        if (count % 2 != 0) {
            System.out.println("CHAT WITH HER!");
        }else

        System.out.println("IGNORE HIM!");

}
}
