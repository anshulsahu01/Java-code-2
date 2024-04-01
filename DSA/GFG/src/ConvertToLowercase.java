
//https://www.geeksforgeeks.org/problems/java-convert-string-to-lowercase2313/1?page=1&difficulty=School&sortBy=submissions
public class ConvertToLowercase {
    static String toLower(String s) {
        // code here
        String res=" ";
        for(int i =0;i<s.length();i++){

            if (s.charAt(i)>= 65 && s.charAt(i)<=96){

                res = res+ (char)(s.charAt(i)+32);


            }else {
                res =res+s.charAt(i);
            }
        }return res;
    }

    public static void main(String[] args) {
        String d="a";
        System.out.println(toLower(d));
    }
}
