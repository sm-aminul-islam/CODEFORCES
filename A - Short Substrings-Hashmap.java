import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ShortSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            HashMap<Character,Integer>mp=new LinkedHashMap<>();
            StringBuilder br=new StringBuilder();
            br.append(s.charAt(0));
            for(int i=1;i<s.length()-1;i++){
                if(!mp.containsKey(s.charAt(i))){
                    mp.put(s.charAt(i),1);
                }
                else {
                    mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                }
                if(mp.get(s.charAt(i))%2!=0){
                    br.append(s.charAt(i));
                }
            }
            br.append(s.charAt(s.length()-1));
            System.out.println(br);
        }
    }
}
