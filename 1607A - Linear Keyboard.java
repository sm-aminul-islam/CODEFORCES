import java.util.HashMap;
import java.util.Scanner;

public class LinearKeyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String s1=sc.next();
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),i);
            }
            int count =0;
            for(int i=0;i<s1.length()-1;i++){
                int x=map.get(s1.charAt(i+1));
                int y=map.get(s1.charAt(i));
                count +=Math.abs((x-y));
            }
            System.out.println(count);
        }
    }
}
