import java.util.*;

public class Pretty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        if(n%2!=0){
            for(int i=0;i<n-1;i+=2) {
                Collections.swap(list, i, i+1);
            }
            Collections.swap(list,n-1,n-2);
            for(int x:list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        else {
            for(int i=0;i<n-1;i+=2) {
                Collections.swap(list, i, i+1);
            }
            for(int y:list){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        }
    }
}
