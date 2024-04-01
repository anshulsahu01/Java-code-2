//https://www.geeksforgeeks.org/problems/sum-palindrome3857/1?page=3&difficulty=School&sortBy=submissions

public class SumPalindrome {

    static long isSumPalindrome(long n){
        // code here
        long rev=0;
        long ans=n;
        long sum;
        while(n>0){

            rev=rev*10+ n%10;
            n=n/10;
        }
        sum=ans+rev;
        return sum;
    }

    public static void main(String[] args) {
        long n=23;
        System.out.println( isSumPalindrome(n));

    }
}
