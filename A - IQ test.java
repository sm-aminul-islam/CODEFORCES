import java.util.Scanner;
public class IQTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int EvenIndex=0,OddIndex=0,count=0;
       for(int i=1;i<=t;i++){
           int n=sc.nextInt();
           if((n&1)==0){
               count++;
               EvenIndex=i;
           }
           else {
               count--;
               OddIndex=i;
           }
       }
       if(count<0){
           System.out.println(EvenIndex);
       }
       else {
           System.out.println(OddIndex);
       }
    }
}
