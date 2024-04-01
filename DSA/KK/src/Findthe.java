public class Findthe {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,4,5,6};
        int target =3;

        int first;
        int last;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                first =i;
                System.out.println("first index is  "+first);
                break;
            }
        }
        for(int i =arr.length-1;i>=0;i--){
            if(arr[i]==target){
                last =i;
                System.out.print("last index is  "+last);
                break;
            }

        }
//        System.out.println("first"+first+"last"+last);
    }
}
