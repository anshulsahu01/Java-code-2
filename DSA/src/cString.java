import java.util.Scanner;
public class cString {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        System.out.println(s);

        String res=" ";
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||
                    s.charAt(i)=='u'){
                res= "*"+s.charAt(i);
            }else{
                res=""+s.charAt(i);
            }System.out.print(res);
        }
    }
}
