import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Borze {
    public static void main(String[] args)throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.'){
                System.out.print("0");
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='.'){
                System.out.print("1");
                i++;
            }
            else {
                System.out.print("2");
                i++;
            }
        }
    }
}
