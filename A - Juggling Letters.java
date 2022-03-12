import java.util.*;

public class Hash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            HashMap<Character, Integer> mp = new HashMap<>();
            int n=sc.nextInt(),flag=0;
            for(int i=0;i<n;i++) {
                String s = sc.next();

                for (int j = 0; j < s.length(); j++) {
                    if (!mp.containsKey(s.charAt(j))) {
                        mp.put(s.charAt(j), 1);
                    } else {
                        mp.put(s.charAt(j), mp.get(s.charAt(j)) + 1);
                    }
                }
            }

          for( char c: mp.keySet()){
              if(mp.get(c)%n!=0){
                  flag=1;
                  break;
              }

          }
          if(flag==1){
              System.out.println("NO");
          }
          else {
              System.out.println("YES");
          }
        }
    }
}
