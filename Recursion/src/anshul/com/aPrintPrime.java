
/*
     Print 1 to 100 without using loops

 */
package anshul.com;

public class aPrintPrime {
    public static void main(String args[]){
        re(1);
    }
    static int  re(int ans){

        if(ans<=4){

            System.out.println(ans++);
            re(ans);

        }

        return ans;
    }
}
