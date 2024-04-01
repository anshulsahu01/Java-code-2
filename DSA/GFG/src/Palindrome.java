
//https://www.geeksforgeeks.org/problems/palindrome0746/1?page=1&difficulty=School&sortBy=submissions


public class Palindrome {
    public static String is_palindrome(int n)
    {
        // Code here
        int a=n;
        int rev=0;
        int ans=0;
        while(n>0){
            ans=n%10;
            rev=rev*10+ans;
            n=  n/10;
            System.out.println(rev);



        }
        if(rev==a){
            return "yes";
        }
//
        return "No";

    }

    public static void main(String[] args) {
        int n=555;
        System.out.println(is_palindrome(n));

    }
}
