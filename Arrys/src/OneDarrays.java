import java.util.Scanner;

public class OneDarrays {
    public static void main(String args[]){

        int[] name = new int[5];


        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of arrays");
        int x = obj.nextInt();


//        int[] num   ={1,2,3,4};

        int arr[]= new int[x];
        System.out.println("know enter the number which you want to store");
        for(int i=0; i<=arr.length-1;i++ ){
            arr[i] = obj.nextInt();
        }
        System.out.println("the stored element are");
        for(int i=0; i<=arr.length;i++){
            System.out.println(arr[i]);
//            System.out.println(arr.length);
        }



        /*
        how to declare an array manualy
         */
        int[] a = new int[5];

         a[0]=15;
         a[1]=15;
         a[2]=15;
         a[3]=15;
         a[4]=15;

         System.out.println(a.length);
         System.out.println(a[3]);



    }
}
