package Recursion.String;

public class RemoveA {
    public static void main(String[] args) {
        String up="daccab";
        System.out.println(skip(up));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else {
            return ch+skip(up.substring(1));
        }
    }
}
