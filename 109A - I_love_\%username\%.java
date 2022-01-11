import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=sc.nextInt();
        int min=max;
        int count=0;
        for(int i=1;i<n;i++)
        {
            int a=sc.nextInt();
            if(a>max||a<min)
                count++;

                min=Math.min(min,a);
                max=Math.max(max,a);

            }
        System.out.println(count);
        }
    }

