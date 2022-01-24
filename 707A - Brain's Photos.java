import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                String s=sc.next();
                if(s.charAt(0)=='C'||s.charAt(0)=='M'||s.charAt(0)=='Y'){
                    System.out.println("#Color");
                    System.exit(0);
                }
            }
        }
        System.out.println("#Black&White");
    }
}
