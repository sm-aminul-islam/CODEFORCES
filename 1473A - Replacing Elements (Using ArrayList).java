
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt(),d=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            if(list.get(0)+list.get(1)<=d || list.get(n-1)<=(d)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
