import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            int sum=0;
            for(int j=0;j<n;j++){
                list.add(sc.nextInt());

            }
            for (int j=0;j<n;j++){
                sum+=list.get(j);
            }
            if(sum>=n){
                System.out.println(sum-n);
            }
            else {
                System.out.println("1");
            }

        }

    }
}
