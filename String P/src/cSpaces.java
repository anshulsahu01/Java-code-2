//this is my class
//find the no. of words in this

import java.util.Scanner;
public class cSpaces {

    /*
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();

        int count =0;
        for(int i=0;i<=s1.length()-1;i++){

            if (s1.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count+1);

        */


    //  this is    my class
 public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();

        int count =0;
        for(int i=0;i<=s1.length()-1;i++){

            if (s1.charAt(i) == ' '&& s1.charAt(i)+1!=' ') {
                count++;
            }
        }
        System.out.println(count+1);

    }
}
