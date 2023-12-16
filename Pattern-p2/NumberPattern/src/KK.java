public class KK {
    public static void main(String args[]){
//        p1(4);
//        p2(4);
//        p3(4);
//        p4(5);
//        p5(5);
        p6(4);
    }



    static void p6(int p) {


    /*
       1      1
       12    21
       123  321
       12344321
     */
        for(int i=p;i>=1;i--){
            for(int j=1;j>=i;j--){
                System.out.print(j);
            } System.out.println(" ");
        }
        System.out.print("hy");
    }
    static void p5(int n){

        /*
1
22
333
4444
55555

         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.println( );
        }
    }

    static void p4(int n){
        /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println( );
        }
    }

   static void p3(int n){
        /*
         *****
         ****
         ***
         **
         *
         */

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println( );
        }
    }



    static void p2(int n){
        /*
         *****
         *****
         *****
         *****
         *****

         */
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print("*");

            }System.out.println();
        }

    }
    static void p1(int n){

        /*
         *
         **
         ***
         ****
         */
        for(int row=1;row<=n;row++){
            for(int coloum=1; coloum<=row; coloum++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
