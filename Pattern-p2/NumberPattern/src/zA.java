public class zA {
    public static void name(){
        int n=11;//11=n,10=n-1
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                if(i==0&&j<n/2||j==n/2||j==0||i==n/2&&j<n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            for (int j=0;j<n ;j++ )
            {
                if(j==1||i==j||j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=0;j<n ;j++ )
            {
                if(i==0&&j>n/2||j==n/2&&i<n/2|| i==n/2&&j>n/2 ||j==n-1&&i>n/2||i==n-1&&j>n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }for (int j=0;j<n ;j++ )
            {
                if(j==n/2||i==n/2&&j>n/2||j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j=0;j<n ;j++ )
            {
                if(j==n/2||j==n-1||i==n-1&&j>n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=0;j<n ;j++ )
            {
                if(j==n/2||i==n-1&&j>n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();



        }

        for (int i=0; i<n;i++) {


            for (int j = 0; j < n; j++) {
                if (i<=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=0;k<=5;k++){
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=0;k<=5;k++){
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (i+j<=n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=0;k<=5;k++){
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (i+j>=n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();


        }



    }
    public static void main(String[] args) {
        name();
    }
}
