import java.util.Scanner;
public class Learning {
    public int dense(int a, int b){
        double min = Math.min(a,b);
        double max = Math.max(a,b);
        int i = 0;
        if(max/min > 2){
            while (min*2 < max){
                i = i +1;
                min = min *2;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Learning m = new Learning();
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t; i++){
            int n= sc.nextInt();
            int[] arr = new int[n];
            for(int j =0; j< n;j++){
                arr[j]= sc.nextInt();
            }
            int sum = 0;
            for(int j = 0; j <  n-1; j++){
                sum += m.dense(arr[j], arr[j+1]);
            }
            System.out.println(sum);
        }
    }
}
