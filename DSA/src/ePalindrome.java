import java.util.Scanner;
public class ePalindrome {
    public static void main(String arg[]){
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int tem=n;
        int revers=0,remender;
        while(n!=0){
            remender=n%10;
            revers=revers*10+remender;
            n=n/10;

        }
//        System.out.println("the number is palindrome"+revers);

        if(revers==tem){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("the number is not palindrome");
        }
    }
}
