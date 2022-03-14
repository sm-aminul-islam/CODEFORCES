import java.util.Scanner;
public class Chatroom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();

        Character[] hello = {'h', 'e', 'l', 'l', 'o'};
        int index = 0;
        char ch = hello[index];
        for (char c : s.toCharArray()) {
            if (c ==ch && index == 4) {
                System.out.println("YES");
                return;
            } else if (c == ch) {
                index++;
                ch = hello[index];
            }
        }

        System.out.println("NO");
    }
}
