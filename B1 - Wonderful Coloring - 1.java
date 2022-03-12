import java.util.HashMap;
import java.util.Scanner;

public class Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Character, Integer> mp = new HashMap<>();
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if (!mp.containsKey(s.charAt(i)))
                {
                    mp.put(s.charAt(i), 1);
                }
                else{
                  mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
                }
                }
           int g=0,r=0,q=0;
            for(char c: mp.keySet()){
                if(mp.get(c)==1){
                    if ((q&1)==0){
                        r++;q++;
                    }else{
                        g++;q++;
                    }
                }
                else if(mp.get(c)>1){
                    g++;r++;
                }
            }
            if(r!=g||s.length()%2!=0){
                System.out.println(r-(r-g));
            }
            else {
                System.out.println(r);
            }
            }
    }
}
