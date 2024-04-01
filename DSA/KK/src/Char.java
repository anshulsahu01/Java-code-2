public class Char {
    static int Binary(char[] arr, char target){
        int start =0;
        int end =arr.length-1;

        while (start<=arr[end]){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
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
        char[] arr ={'a','b','d','f','h','k'};
        char target='f';
//        System.out.println(Binary(arr,target));
        System.out.println(arr[5]);
    }
}
