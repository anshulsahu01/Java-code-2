public class FrequencyOfNo {

    public static void Frequency(int arr[]){

        for (int j=0;j<=arr.length-1;j++){
            int x= arr[j];
            if(x==-1)continue;
            int count =0;

            for(int i=0;i<=arr.length-1;i++){
                if(x==arr[i]){
                    count++;
                    arr[i]=-1;
                }
            }
            System.out.println("Frequency of  "+x +"  is : "+ count);

        }


    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,12,1,12,14,14};
        Frequency(arr);

    }
}
