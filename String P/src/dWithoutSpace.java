/*
this is    my class :- input
thisismyclass :-out put
 */
import java.util.Scanner;
public class dWithoutSpace {

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();

        String res;

        for(int i=0;i<=s.length()-1;i++){

            if(s.charAt(i)!=' '){
//                res=s.charAt(i)+res ;
            }
        }

    }
}
