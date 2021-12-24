import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        HashSet<Character> set;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        while(true){
            n = n+1;
            s = ""+n;
            set = new HashSet<>(); // get a new set for every new number 
            for(int i = 0; i < s.length(); i++){
                set.add(s.charAt(i));
            }
            if(set.size() == s.length()){
                System.out.println(n);
                break;
            }
        }

    }
}
