/*

//  LinearSearch


Find the minimum array

find the max arr

 */

public class gMiniMumArr {
    public static void main(String arrgs[]){
        int arr[]={11,12,2,-3,77,9};
        System.out.println(mini(arr));
        System.out.println(max(arr));
    }
    static int mini(int arr[]){
        int ans=arr[0] ;
        for(int i=0; i<arr.length;i++){
            if (arr[i]<ans){
                ans= arr[i];
            }
        }
        return ans;

    }

    static int max(int arr[]){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }return ans;
    }
}
