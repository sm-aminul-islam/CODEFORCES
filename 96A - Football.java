import java.util.Scanner;
public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0,sum=0,flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
                 sum=0;
            }
            else {
                sum++;
               count=0;
            }
            if(sum==7 || count==7){
              flag=1;
            }

        }
        if(flag==1){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }



    }
}
