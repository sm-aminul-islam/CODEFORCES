import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem,maxcapacity=0,e=0;
        for(int i=0;i<n;i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            rem=enter-exit;
            e+=rem;
            if(maxcapacity<e){
               maxcapacity=e;
            }
        }

        System.out.println(maxcapacity);


    }

}
