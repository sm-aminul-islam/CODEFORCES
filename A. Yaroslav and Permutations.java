import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int max=Collections.max(mp.values());
        if(max<=(n+1)/2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
