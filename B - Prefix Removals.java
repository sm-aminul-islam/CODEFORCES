import java.util.*;

public class PrefixRemoval {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            HashMap<Character,Integer>mp=new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(!mp.containsKey(s.charAt(i))){
                   mp.put(s.charAt(i),1);
                }
                else {
                   mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                }
            }
           int n=0;
            for(int i=0;i<s.length();i++){
                if(mp.get(s.charAt(i))>1){
                    n++;
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);

                }
                else {
                    break;
                }
            }
            System.out.println(s.substring(n));
        }

    }
}
