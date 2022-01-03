import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[1000000];
        int count =0;
        for (int i = 0; i <n; i++) {
             a [i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]!=a[i+1]){
                count++;
            }

        }
        System.out.println(count);

    }

}
