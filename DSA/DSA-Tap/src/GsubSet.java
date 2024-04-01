public class GsubSet {

    public static String subset(int[] m ,int[] n) {

        for(int i=0;i<n.length;i++){

            for(int j =0 ;j<m.length;j++) {


                if (n[i] == m[j]) {
                    return "true";
                }
            }
        }
              return "false";

    }
    public static void main(String[] args) {
        int[] m = {1,2,3,4,5,6};
        int[] n ={2,5,7};

        System.out.println(subset(m,n));


    }
}
