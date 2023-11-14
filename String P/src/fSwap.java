/*
input:- ThiS Is mY ClAss
 */

import java.util.Scanner;
public class fSwap {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        System.out.println("enter the character");
        String s=obj.nextLine();
        String res=" ";
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)>=65&&s.charAt(i)<=97){
                res = res +((char)(s.charAt(i)+32));
            }
            else if (s.charAt(i)>=97&&s.charAt(i)<=122){
                res = res +((char)(s.charAt(i)-32));
            }

        }System.out.println(res);

    }
}
