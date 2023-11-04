// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*

        Scanner obj =new Scanner(System.in);
        System.out.println("enter the siz of arry");
        int n=obj.nextInt();


      int[] arr=new int[n];
      for(int i=0;i<=n-1;i++){
          System.out.print ("enter the value of arr "  +i+"  ");
          arr[i]=obj.nextInt();
      }
      for(int i=0;i<=n-1;i++){
            System.out.println (arr[i]);
      }


        System.out.println("enter the target");

      int target=obj.nextInt();
       int sum= Linear( arr,  target);
       System.out.print(sum);
    }
    static int Linear(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }
        for(int index =0;index<=arr.length-1;index++){
            int element =arr[index];
            if (element==target){
                return index;

            }

        }
        return -1;

        */


        int a;
        Scanner n=new Scanner(System.in);
        System.out.println("enter a number who's table you want");

        a=n.nextInt();

        System.out.println("enter a number till which term table you want");
        int term=n.nextInt();
        for(int i=1;i<=term;i++){
            int sum =a*i;
            System.out.println(a+ "*" +i +"="+sum);
        }



    }

}