import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        String s= sc.next();
        char [] s1=s.toCharArray();
        for (int i=0;i< s1.length-1;i++){
            if (s1[i]==s1[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
