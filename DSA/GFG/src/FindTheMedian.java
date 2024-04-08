public class FindTheMedian {

    public static int find_median(int[] v)
    {
        // Code here
        int size= v.length-1;
        int temp;
        for(int i=0;i<=v.length-2;i++){

            for(int j=i+1;j<=v.length-1;j++){

                if(v[i]>v[j]){
                    temp=v[i];
                    v[i]=v[j];
                    v[j]=temp;
                }
            }
            System.out.println(v[i]);
        }
        return v[size/2];

    }

    public static void main(String[] args) {
      int  arr[] = {1,100,102,5,8,11,66,1071,22,16};
        System.out.println(find_median(arr));
    }
}
