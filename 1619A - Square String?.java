import java.util.ArrayList;
import java.util.Scanner;

public class SqureString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next().toLowerCase();
            ArrayList<Character> list=new ArrayList<>();
            for(int j=0;j<s.length()/2;j++){
              list.add(s.charAt(j));
            }
          ArrayList<Character> list1=new ArrayList<>();
            for(int j=s.length()/2;j<s.length();j++){
                list1.add(s.charAt(j));
            }
            if(list.equals(list1)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
