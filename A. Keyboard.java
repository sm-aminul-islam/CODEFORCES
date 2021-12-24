import java.util.ArrayList;
import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        String panagram = "qwertyuiopasdfghjkl;zxcvbnm,./";
        for(int i = 0; i < panagram.length(); i++){
            list.add(panagram.charAt(i));
        }
        String shiftValue = sc.next();
        String printedLine = sc.next();
        
        for(int i = 0; i < printedLine.length(); i++){
            if(shiftValue.equals("R"))
                System.out.print(list.get(list.indexOf(printedLine.charAt(i))-1));
            
            else
                System.out.print(list.get(list.indexOf(printedLine.charAt(i))+1));
        }
    }
}
