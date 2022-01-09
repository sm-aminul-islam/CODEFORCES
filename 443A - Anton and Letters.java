import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("{","");
        s=s.replace("}","");
        s=s.replaceAll(", ","");
        Set<Character> ch=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            ch.add(s.charAt(i));
        }
        System.out.println(ch.size());

    }
}
