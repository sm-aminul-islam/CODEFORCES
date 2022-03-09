import java.util.*;

public class DeleteAdj {

   
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
          StringBuilder br=new StringBuilder(sc.next());
          char ch=sc.next().charAt(0);
          int flag=0;
          for(int i=0;i<br.length();i++){
              if(br.charAt(i)==ch && ((i+1)%2)!=0){
                  flag=1;
                  break;
              }
          }
          if(flag==1){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }
      }
    }
    
}
