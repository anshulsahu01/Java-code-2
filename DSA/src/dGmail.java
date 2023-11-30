import java.util.Scanner;

public class dGmail {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        System.out.println(s);

        String res="";
        String r="";
        String rf="";
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)<=65&&s.charAt(i)>=90||s.charAt(i)<=97&&s.charAt(i)<=122){
                res=res+s.charAt(i);

            }else{
                r=res +s.charAt(i);

            }


        }  rf=res+r;
        System.out.print("Resultent string is "+rf);



    }
}
