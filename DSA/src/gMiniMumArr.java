/*

//  LinearSearch


Find the minimum array

find the max arr


// Binary Search

 */

public class gMiniMumArr {
    public static void main  (String arrgs[]) {
        int arr[]={1,2,3,4,5,6,7};
        int tar=2;
System.out.print(BinaryS(arr,tar));

//        System.out.println(SI(arr,tar));
//        System.out.println(mini(arr));
//        System.out.println(max(arr));
    }
    static int BinaryS(int arr[],int target){
        int start =arr[0];
        int end= arr.length-1;

        while(start<=end){
            int mid = start +(start-end)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;

            }else{
                //ans found
                return mid;
            }

        }



        return -1 ;
    }
   //1st
    static int mini(int arr[]){
        int ans=arr[0] ;
        for(int i=0; i<arr.length;i++){
            if (arr[i]<ans){
                ans= arr[i];
            }
        }
        return ans;

    }
//2nd
    static int max(int arr[]){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }return ans;
    }



//3rd
   /*
    static int SI(int arr[],int target) {

        int ans = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {

                ans = i+ans;
                System.out.println("the index is " + i);

            }
        }
        return ans;

    }


    */



}
