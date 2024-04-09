package Recursion;

public class HsortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,9,10};
        int index=0;
        System.out.println(search(arr,index));

    }
    static boolean search(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]&& search(arr,index+1));

    }
}
