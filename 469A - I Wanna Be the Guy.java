import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int p=sc.nextInt();
        Set<Integer> distinct=new LinkedHashSet<>();
        while(p-->=1){
            distinct.add(sc.nextInt());
        }
        int q=sc.nextInt();
        while(q-->=1){
            distinct.add(sc.nextInt());
        }
        if(distinct.size()==n)
        {
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
