package Recursion;

import java.util.ArrayList;

public class HsortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,9,9,10};
        int target=9;
        int index=0;
//        System.out.println(search(arr,index));
//        System.out.println(search2(arr ,target));

        findtheAccurence(arr,target,index);
        System.out.println(list);
    }
    static boolean search(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]&& search(arr,index+1));

    }
    static int index=0;
    static int search2(int[] arr, int target){
        if(arr[index]==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        ++index;
        return  search2(arr, target );

    }


    static ArrayList<Integer> list=new ArrayList<>();

    static void findtheAccurence(int[] arr, int target ,int index){
        if(arr[index]== arr.length){
            return ;
        }
        if (arr[index]==target){
            list.add(index);
        }
        findtheAccurence(arr,target ,index+1);

    }
}
