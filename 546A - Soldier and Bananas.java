import java.util.Scanner;

public class ShortSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int k=sc.nextInt(),n=sc.nextInt(),w=sc.nextInt(),sum=k;
      for(int i=2;i<=w;i++){
          sum+=i*k;

      }
      if(sum<=n){
          System.out.println("0");

      }
      else {
          System.out.println(sum-n);
      }

    }
}
