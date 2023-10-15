// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int[] arr={1,2,4,5,6,7,89};
      int target=9;
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
    }

}