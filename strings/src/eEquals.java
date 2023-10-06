import java.util.Scanner;

public class eEquals {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        String s1 = obj.nextLine();
        String s2 = obj.nextLine();

        if(s1.equals(s2)){
            System.out.println("String reference are equal");

        }else{
            System.out.println("String reference are not equal");
        }
    }
}
