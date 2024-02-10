import java.util.Scanner;

public class zAll {

    static void A(){
        int n=6;
        for (int i=1; i< n;i++){

                for(int j=1;j<n;j++){
                    if(i==1||i==n/2 ||j==1||j==5) {


                        System.out.print("*");

                    }else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
    static void B(){
        int n=6;
        for (int i=1; i< n;i++){

                for(int j=1;j<n;j++){
                    if(i==1||i==n/2 ||j==1||j==5 ||i==5) {


                        System.out.print("*");

                    }else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
    static void C(){
        int n=6;
        for (int i=1; i< n;i++){

                for(int j=1;j<n;j++){
                    if(i==1 ||j==1 ||i==5) {


                        System.out.print("*");

                    }else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
    static void D(){
        int n=6;
        for (int i=1; i< n;i++){

                for(int j=1;j<n;j++){
                    if(i==1 ||j==1 ||i==5||j==5) {


                        System.out.print("*");

                    }else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
    public static void E(){

        int n=6;
        for(int i=1;i<=n;i++){
            if(i==1 ||i==n/2 ||i==n ){
                for (int j=1;j<=n/2;j++){
                    System.out.print("*");
                }


            }
            System.out.println("*");
        }

    }
    public static void F(){

        int n=6;
        for(int i=1;i<=n;i++){
            if(i==1 ||i==n/2 ){
                for (int j=1;j<=n/2;j++){
                    System.out.print("*");
                }


            }
            System.out.println("*");
        }

    }
    public static void G(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(i==1||j==1 ||i==n/2&&j>n/2 || i==n-1 &&j<n/2 || i>n/2&&j==n/2 || i>n/2&&j==n-1) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void H(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==n-1||j==1 ||i==n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void I(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(i==n-1||i==1 ||j==n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void J(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(i==n-1&& j<n/2 ||j==n/2 ||j==1&&i>n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void K(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1 ||i==j&&i>n/2 ||j +i== n&&j>n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void L(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1 ||i==n-1&&j==n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void N(){
//
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||j==n-1 ||i==j) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void M(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||j==n-1||i==j&&i<n/2||i+j==n&&i<n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } public static void O(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||j==n-1||i==j&&i<n/2||i+j==n&&i<n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void P(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||i==1&&j<n/2||j==n/2 &&i<n/2 || i==n/2&&j<n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Q(){

        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int n =obj.nextInt();
//        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||j==n-1||i==j&&i<n/2||i+j==n&&i<n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void R(){

//        Scanner obj= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n =obj.nextInt();
        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||i==1&&j<n/2||j==n/2 &&i<n/2 || i==n/2&&j<n/2 ||i==j&&j>n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void S(){

//        Scanner obj= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n =obj.nextInt();
        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||i==1&&j<n/2||j==n/2 &&i<n/2 || i==n/2&&j<n/2 ||i==j&&j>n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void U(){

//        Scanner obj= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n =obj.nextInt();
        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||j==n-1||i==n-1) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void V(){

//        Scanner obj= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n =obj.nextInt();
        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(i==j/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void W(){

//        Scanner obj= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n =obj.nextInt();
        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||i==1&&j<n/2||j==n/2 &&i<n/2 || i==n/2&&j<n/2 ||i==j&&j>n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } public static void X(){

//        Scanner obj= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n =obj.nextInt();
        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||i==1&&j<n/2||j==n/2 &&i<n/2 || i==n/2&&j<n/2 ||i==j&&j>n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Y(){

//        Scanner obj= new Scanner(System.in);
//        System.out.println("enter a number");
//        int n =obj.nextInt();
        int n =11;

        for (int i=1; i< n;i++){

            for(int j=1;j<n;j++){
                if(j==1||i==1&&j<n/2||j==n/2 &&i<n/2 || i==n/2&&j<n/2 ||i==j&&j>n/2) {


                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        A();
//        B();
//        C();
//        D();
//        E();
//        F();
//          G();
//          H();
//          I();
//          J();
//          K();
//          L();
//          N();
//          M();
//          O(); *
//          P();
//          Q();*
//          R();
//          S();
//          U();
//          V();
//          X();
//          Y();
//          Z();


//        char a='h';
//        int b= 1245;
//        String s="sndhul";
//        boolean bb = true;
//        float f= 120.2f;
//        long l=544542;

//        System.out.println(a);

    }
}
