import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int count=0,ch=0;
            String s=sc.next();
            for (int j=0;j<s.length();j++){
                if (s.charAt(j) == '0') {
                    count++;
                }else if(s.charAt(j)=='1'){
                    ch++;
                }
            }
            if (count==ch  && ch==1){
                System.out.println("0");
            }
            else if (count==ch){
                System.out.println(count-1);
            }
            else{
                System.out.println(Math.min(count,ch));
            }
        }
    }
}


