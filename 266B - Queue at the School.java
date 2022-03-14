import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=sc.nextInt();
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<t;i++){
            for(int j=0;j<n-1;j++){
                if(ch[j]=='B' && ch[j+1]=='G'){
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                    j++;
                }
            }
        }
        System.out.println(ch);
    }
}
