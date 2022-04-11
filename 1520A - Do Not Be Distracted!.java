import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distructed {
    static Scanner sc = new Scanner(System.in);
    public static void solver(){
        int n = sc.nextInt();
        String s=sc.next();
        HashSet <Character> set =new HashSet<>();
        int mPointer = 0, sPointer = 0;
        while(mPointer < n){
            sPointer = mPointer;
            if(set.contains(s.charAt(mPointer))){
                System.out.println("NO");
                return;
            }
            else{
                set.add(s.charAt(mPointer));
            }
            while(sPointer <= n){
                if(sPointer == n){
                    mPointer = sPointer;
                }
                else if(s.charAt(sPointer) != s.charAt(mPointer)){
                    mPointer = sPointer;
                    break;
                }

                sPointer++;
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {

        int t=sc.nextInt();
        while (t-->0) {
            solver();

        }
    }
}
