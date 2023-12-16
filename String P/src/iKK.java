public class iKK {
    public static void main(String args[]) {
//        float a =1.25552f;
//        System.out.printf("anshul %.3f",a);


        //char ko print karoge to asci value print hogi

//        System.out.println('a'+'b');
//
//        System.out.println('b');

// Print  ABCDEFGHIJKLMNOPQRSTUVWXYZ
        /*
        in dono mai  time complexcity hai qu ki value
         baar-baar add krna pad ra hai
         */

        String series = " ";
        for (int i = 1; i <= 26; i++) {
            char ch = (char) (64 + i);
            series = series + ch;
        }
        System.out.println(series);




        // print   abcdefghijklmnopqrstuvwxyz

        String series1 = " ";
        for(int i=1;i<=26;i++){
            char ch =(char)(96+i);
            series1 = series1 +ch;
        }System.out.println(series1);


        /*
         StringBuilder
         */
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<26;i++){
            char ch =(char)('a'+i);
            ans.append(ch);
        }
        System.out.println(ans.toString());

    }

}
