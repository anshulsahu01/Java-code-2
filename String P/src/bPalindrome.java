/*
maam
malayalam

 */

import java.util.Scanner;


public class bPalindrome {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=s.nextLine();

        String res="";
        String reversed="";
        for(int i=s1.length()-1;i>=0;i--){
            res= res+s1.charAt(i);


        }

        System.out.println(res);

        if(s1.equals(res)==true){ //  ***
            
            System.out.println("palndrone");
        }else {
            System.out.println("the String is not palndrone");
        }

    }
}
