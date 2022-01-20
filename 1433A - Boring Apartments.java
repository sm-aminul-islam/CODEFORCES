import java.util.Scanner;

public class BoringApartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=(n%10-1)*10;
            if(n<=9){
                System.out.println(x+1);
            }
            else if(n<=99){
                System.out.println(x+3);
            }
            else if(n<=999){
                System.out.println(x+6);
            }
            else {
                System.out.println(x+10);
            }
        }

        }
    }


