import java.util.Scanner;
public class BuyShovel {
    static  void solution(int k,int r){
        int sum=0;
        for(int i=1;;i++){
            sum+=k;
            if((sum%10==0) || (sum%10)==r){
                System.out.println(i);
                break;
            }
            else {
                continue;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),r=sc.nextInt();
        solution(k,r);
    }
}
