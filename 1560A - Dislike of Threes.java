import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int j=1,count=0;
            while(n>0){
                if(j%3!=0 && j%10!=3){
                    n--;

                }
                j++;

            }
            System.out.println(j-1);


        }
    }
}
