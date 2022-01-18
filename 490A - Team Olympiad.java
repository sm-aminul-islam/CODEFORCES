import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 =  new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            if(a == 1)
                s1.push(i);
            else if(a == 2)
                s2.push(i);
            else
                s3.push(i);
        }
        System.out.println(Math.min(s1.size(), Math.min(s2.size(), s3.size())));;
        while(!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()){
            System.out.println(s1.pop() + " "+ s2.pop() + " " + s3.pop());
        }
    }

}

