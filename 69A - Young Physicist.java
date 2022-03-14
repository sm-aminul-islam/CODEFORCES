import java.util.Scanner;
public class Physicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n*3];
        int x=0,y=0,z=0;
        for(int i=0;i<n*3;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n*3;i+=3){
            x+=arr[i];
            y+=arr[i+1];
            z+=arr[i+2];
        }
       if(x==0 && y==0 &&z==0){
           System.out.println("YES");
       }
       else {
           System.out.println("NO");
       }

    }
}
