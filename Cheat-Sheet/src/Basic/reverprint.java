package Basic;
/*
input :- 10;
output:- 1,2,3,4,6,7,8,9,10;
 */

public class reverprint {
    static int rev(int n){
        if(n==1){
            return 1;
        }
        else if(n==5){

        }
        else {

            System.out.print(n + " ");
        }
        return rev(n-1);

    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(rev(n));

    }

}
