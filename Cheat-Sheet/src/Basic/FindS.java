package Basic;
//https://takeuforward.org/data-structure/find-the-smallest-element-in-an-array/


//takeuforward.org/data-structure/find-the-largest-element-in-an-array/

public class FindS {
    static int large(int[] arr){
        int s=arr[0];
        for(int i=0;i<arr.length;i++){
            if(s<arr[i]){
                s=arr[i];
            }else {

            }
        }
        return s;

    }
    static int small(int[] arr){
        int s=arr[0];
        for(int i=0;i<arr.length;i++){
            if(s>arr[i]){
                s=arr[i];
            }else {

            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr= {2,5,1,3,0};
//        System.out.println(small(arr));
        System.out.println(large(arr));
    }

}
