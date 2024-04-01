//https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty=School&sortBy=submissions

//find the index equal to value

public class FtheValueEqtoIndex {
    public static void main(String[] args) {
        int arr[]={1};

        for (int i=0;i<arr.length;i++){

            if(arr[i]==i+1){
                System.out.println(i+1);
            }else {
              //  System.out.println(false);
            }
        }
    }
}
