import java.util.Scanner;
public class threeDarrays {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the number of School is there");
        int school =obj.nextInt();
        System.out.println("enter the number of class is there in each school");
        int cls =obj.nextInt();

        System.out.println("enter the number of Student is there in each class");
        int stud =obj.nextInt();

        int[][][] arr = new int[school][cls][stud];

        for(int i=0;i<=arr.length-1;i++){

            for(int j=0;j<=arr[i].length-1;j++){

                for(int k=0;k<=arr[i][j].length-1;k++){
                    System.out.println("enter the marks of schools "+i+" class "+j+" student "+k);

                   arr[i][j][k] =  obj.nextInt();
                }

            }

        }
        for(int i=0;i<=arr.length-1;i++){

            for(int j=0;j<=arr[i].length-1;j++){

                for(int k=0;k<=arr[i][j].length-1;k++){
                    System.out.println(" the Stored marks of schools "+i+" class "+j+" Student "+k);

                   System.out.println( arr[i][j][k]);
                }

            }

        }

    }
}
