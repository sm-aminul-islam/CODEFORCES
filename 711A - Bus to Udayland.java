import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Learning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag =0;
        List<String> list=new ArrayList<>();
        for(int j=0;j<n;j++) {
            StringBuilder sb=new StringBuilder(sc.next());
            for(int i=1;i<=4;i++) {
                if(sb.charAt(i)=='O'&& sb.charAt(i-1)=='O' && flag==0) {
                    flag=1;
                    sb.setCharAt(i,'+');
                    sb.setCharAt(i-1,'+');
                }

            }
            list.add(sb.toString());

        }
        if(flag==1) {
            System.out.println("YES");
            for(String s:list) {
                System.out.println(s);

            }
        }
        else {
            System.out.println("NO");
        }

    }
}
