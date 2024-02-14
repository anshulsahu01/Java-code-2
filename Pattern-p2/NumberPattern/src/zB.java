public class zB {
    public static void main(String[] args) {
        int n=11;//11=n,10=n-1
        //R1
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                if(i+j>=n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=0;j<n ;j++ )
            {
                System.out.print(" ");
            }
            for (int j=0;j<n ;j++ )
            {
                if(i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //R2
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                System.out.print(" ");
            }
            for (int j=0;j<n ;j++ )
            {
                if(i+j<=n-1 && i>=n/2 ||
                        i+j>=n-1 && i<=n/2 ||
                        i>=j     && j>=n/2 ||
                        i<=j     && j<=n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //R3
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                if(i<=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=0;j<n ;j++ )
            {
                System.out.print(" ");
            }
            for (int j=0;j<n ;j++ )
            {
                if(i+j<=n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
