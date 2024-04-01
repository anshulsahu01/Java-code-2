public class NumOfTimeRepeat {
    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 3, 5, 5, 8, 8, 9, 9, 6, 1, 1,};
        for (int i =0;i<=arr.length-1;i++){
            int count=0;
            for (int j=1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+"="+count);
        }

    }
}
