import java.util.*;
public class Domino {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k2 = sc.nextInt(), k3 = sc.nextInt(), k5 = sc.nextInt(), k6 = sc.nextInt();
        long sum = 0;
        while(k2 > 0 && k5 > 0 && k6 > 0){
            sum += 256;
            k2--;k5--;k6--;
        }
        while(k2 > 0 && k3 > 0){
            sum += 32;
            k2--;k3--;
        }
        System.out.println(sum);
    }
}
