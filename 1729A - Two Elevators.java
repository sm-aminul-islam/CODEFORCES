import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Codeforces {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
           int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
           int d=a-1;
           int d1=Math.abs(b-c)+Math.abs(c-1);
           int ans=0;
           if(d<=d1){
               ans+=1;
           }
           if(d>=d1){
               ans+=2;
           }
            System.out.println(ans);
        }
        
        
    }
    
}
