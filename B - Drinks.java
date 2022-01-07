import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double arr[]=new double[(int) n];
        double sum=0;
        double avarage = 0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
             avarage=sum/arr.length;
        }
        System.out.printf("%.12f",(double)avarage);
    }
}
