import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt(),B=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
                int arr[]=new int[n+1];
                arr[0]=0;
                long sum=0;
                for(int j=1;j<arr.length;j++){
                    if(x+arr[j-1]>B){
                      arr[j]=arr[j-1]-y;
                    }
                    else {
                        arr[j]=arr[j-1]+x;
                    }
                    sum+=arr[j];
                }
                System.out.println(sum);
            }

        }
    }

