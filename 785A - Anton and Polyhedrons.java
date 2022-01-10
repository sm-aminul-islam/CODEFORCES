import java.util.Scanner;

public class Polyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            if(s.equals("Tetrahedron")){
                count+=4;
                continue;
            }
            if(s.equals("Cube"))
            {
                count+=6;
                continue;
            }
            if(s.equals("Octahedron"))
            {
                count+=8;
                continue;
            }
            if(s.equals("Dodecahedron"))
            {
                count+=12;
                continue;
            }
            if(s.equals("Icosahedron" ))
            {
                count+=20;
                continue;
            }
        }
       System.out.println(count);
    }
}
