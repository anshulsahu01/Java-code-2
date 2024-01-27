public class first {
    public static void main(String[] args) {

//        int[] arr={1,2,3,4,5};
////        System.out.println(arr[2]);
//        int sum =0;
//        for(int i=0;i<=arr.length-1;i++){
//            sum =arr[i]+sum;
//
//
//        }System.out.println(sum);
//        String a ="abc";
//        String b ="poi";
//      String s = mergeAlternately(a,b);
//      System.out.println(s);
//
//    }
//        public static String mergeAlternately(String word1, String word2) {
//
//            String merged =" ";
//            for(int i=0; i<=word1.length() -1;i++){
//                merged = merged+word1.charAt(i) +word2.charAt(i);
//            }
//            return merged;
//        }

//        String s1 ="the game is done";
//        String result =" ";
//            for(int i=s1.length()-1;i<=0;i--){
//                if(s1.charAt(i) == ' '){
//
//                    result = s1.charAt(i) +result;
//
//
//                }
//            }System.out.println(result);






//        String s1 ="abcabc";//output :- abc
//        String res=" ";
//
//        for(int i=0;i<=s1.length()-1 ; i++){
//
//            for(int j=i+1;j<=s1.length()-1;j++){
//                if(s1.charAt(i)==s1.charAt(j)){
//                    res= res+s1.charAt(i);
//
//                }
//            }
//        }System.out.println(res);




        String a ="ABCABC";
        String b ="AC";

        String res="";
        for(int i=0;i<=a.length()-1;i++){
            for(int j=0;j<=b.length()-1;j++){
                if(a.charAt(i)==b.charAt(j) ){
                    res=res+a.charAt(i);
                }
            }
        }System.out.println(res);

    }
}
