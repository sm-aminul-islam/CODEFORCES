import java.util.Scanner;

public class Playoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while (t-->0){
          int n=sc.nextInt();
          int arr[]=new int[n];
          if(n<=19){
              System.out.println("YES");
              arr[0]=1;
              for(int j=1;j<n;j++){
                  arr[j]=arr[j-1]*3;

              }
              for(int j=0;j<n;j++){
                  System.out.print(arr[j]+" ");
              }
              System.out.println();
          }
          else {
              System.out.println("NO");
          }
      }


    }
}
