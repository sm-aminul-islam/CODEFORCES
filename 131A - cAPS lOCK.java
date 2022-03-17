import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String sb=sc.next();int flag=0,yo=0,hbena=0;
       for (int i=0;i<sb.length();i++){
           if(sb.charAt(i)>=65 && sb.charAt(i)<=90){

           }else{
               hbena=1;
           }
       }
       if(hbena==0){
           System.out.println(sb.toLowerCase());
       }else {
           if (sb.charAt(0) >= 97 && sb.charAt(0) <= 122) {
               flag = 1;
           }
           for (int i = 1; i < sb.length(); i++) {
               if (sb.charAt(i) >= 65 && sb.charAt(i) <= 90) {
                   yo++;
               }
           }
           if (flag == 1 && sb.length() - 1 == yo) {
               String k = sb.toLowerCase();
               char[] ch = k.toCharArray();
               ch[0] = Character.toUpperCase(ch[0]);
               System.out.println(ch);
           } else {
               System.out.println(sb);
           }
       }
    }
}
