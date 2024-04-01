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

//        String a="aba";
//
//        String tem= " ";
//        for(int i=a.length()-1;i>=0;i--){
//
//            tem=tem+a.charAt(i);
//            System.out.println(tem);
//
//        }
//        if(a.equals(tem)){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//        System.out.println(tem);


//        String a ="ABCABC";
//        String b ="AC";
//
//        String res="";
//        for(int i=0;i<=a.length()-1;i++){
//            for(int j=0;j<=b.length()-1;j++){
//                if(a.charAt(i)==b.charAt(j) ){
//                    res=res+a.charAt(i);
//                }
//            }
//        }System.out.println(res);public class CharacterCounter {
//    public static void main(String[] args) {
//        String input = "r$3y@o9hy#*a&r"; // Replace this with user input if needed
//
//        int digitCount = 0;
//        int alphabetCount = 0;
//        int specialCharCount = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (ch >= '0' && ch <= '9') {
//                digitCount++;
//            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//                alphabetCount++;
//            } else {
//                specialCharCount++;
//            }
//        }
//
//        System.out.println("Numbers: " + digitCount);
//        System.out.println("Alphabets: " + alphabetCount);
//        System.out.println("Special Characters: " + specialCharCount);
//    }
//}



//        public class CharacterCounter {
//            public static void main(String[] args) {
//                String input = "r$3y@o9hy#*a&r"; // Replace this with user input if needed
//
//                int digitCount = 0;
//                int alphabetCount = 0;
//                int specialCharCount = 0;
//
//                for (int i = 0; i < input.length(); i++) {
//                    char ch = input.charAt(i);
//                    if (ch >= '0' && ch <= '9') {
//                        digitCount++;
//                    } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//                        alphabetCount++;
//                    } else {
//                        specialCharCount++;
//                    }
//                }
//
//                System.out.println("Numbers: " + digitCount);
//                System.out.println("Alphabets: " + alphabetCount);
//                System.out.println("Special Characters: " + specialCharCount);
//            }
//        }


        //Pattern q
//        for(int i=1;i<5;i++){
//
//            for(int j=0;j<i;j++){
//                System.out.print(i);
//            }
//            System.out.println("");
//        }


//Q2

//                int n = 4; // Change this value to adjust the size of the pattern

                // Printing upper half of the pattern
//                for (int i = n; i >= 1; i--) {
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print(n - i + 1);
//                    }
//                    System.out.println();
//                }
//
//                // Printing lower half of the pattern
//                for (int i = 2; i <= n; i++) {
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print(n - i + 1);
//                    }
//                    System.out.println();
//                }

                //APPLE no of repetaion

        String s1="APPLE";

        for(int i=0;i<s1.length();i++) {
            int temp = 1;
            for(int j=i+1;j<s1.length()-1;j++){

                if(s1.charAt(i)==s1.charAt(j)){
                    temp++;
//                    s1.[j]=;

                }

            }System.out.print(s1.charAt(i)+""+temp);


        }

    }
}
