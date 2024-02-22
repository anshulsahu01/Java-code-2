public class BinarySearch {
    static int Binary(int[] arr, int target){
        int start =0;
        int end =arr.length-1;

        while (start<=arr[end]){
            int mid = start+(end-start)/2;

            if(target<mid){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else {
                arr[end]= target;
                return mid;
            }

        }return end;

    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,6,8,11,14,18,19,21};
        int target=1;
        System.out.println(Binary(arr,target));
    }
    
}
