//https://takeuforward.
// org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
package Basic;

import java.util.Arrays;

public class SndL {
    static int sl(int arr[]){
        int sl=arr[arr.length-3];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];

                    arr[j]=temp;

                }

            }

        }
//        System.out.println(Arrays.toString(arr));

        return sl;
    }
    public static void main(String[] args) {
        int arr[]={5,2,8,0,6,11,22,1};
        System.out.println(sl(arr));
//        sl(arr);
    }

}
