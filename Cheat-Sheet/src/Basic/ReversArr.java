package Basic;
//https://takeuforward.org/data-structure/reverse-a-given-array/

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversArr {
    static String r(int arr[]){
        Arrays.sort(arr);
        int t=0;
        for (int i = arr.length-1; i > arr.length/2 ; i--) {
            int tem=arr[i];
            arr[i]=arr[t];
            arr[t]=tem;
            t++;


        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(r(arr));
    }
}
