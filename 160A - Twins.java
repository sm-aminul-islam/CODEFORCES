import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
            sum+= list.get(i);
        }
        Collections.sort(list);
        int min=0,x=0;
        for(int i=n-1;i>=0;i--){
            if(sum>=x){
                x+= list.get(i);
                min++;
                sum-= list.get(i);
            }
            else {
                break;
            }
        }
        System.out.println(min);



    }
}
