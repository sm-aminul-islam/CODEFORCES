import  java.util.Scanner;
public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[]=new int[n+1];
        int finalplayer=0;
        for(int i=1;i<=n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; i++){
            if(a[i] > 0 && a[i] >= a[k])finalplayer++;
        }
        System.out.println(finalplayer);

    }
}
