import java.util.Scanner;

public class hConvert {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a  string");
        String s = obj.nextLine();
        String result = " ";

        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 97) {
                result = result + (char) (s.charAt(i) +32);
            } else {
                result = result + s.charAt(i);
            }


        }

        System.out.println(result);

    }
}