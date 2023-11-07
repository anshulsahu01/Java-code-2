/*find the number of spaceses
This is my clss
output:- 3
 */
import java.util.Scanner;

public class aString {
    public static void main(String args[]) {
        System.out.println("hey");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println(s1);
        int count =0;
        for(int i=0; i<=s1.length()-1;i++){

            if(s1.charAt(i)==' ') {
                count++;

            }
        }System.out.println(count);
    }



}