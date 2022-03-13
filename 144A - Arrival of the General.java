import java.util.Scanner;
public class ArrivalGeneral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max_value=0,min_value=9999,max=0,min=0;
        for(int i=0;i<n;i++)
        {
           int a=sc.nextInt();
           if(a>max_value){
               max=i;
               max_value=a;
           }
           if(a<=min_value){
               min=i;
               min_value=a;
           }
        }
        if(max>min){
            System.out.println((max-1)+(n-min)-1);
        }
        else
        {
            System.out.println((max-1)+(n-min));
        }


    }

}
