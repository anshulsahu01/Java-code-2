public class ReverseVowels {

    public static void main(String[] args) {


        String s = "hello";
        int start = 0;
        int end = s.length()-1;
        char ch[] = s.toCharArray();

        while (start < end) {

            if (!vowel(ch[start])) {
                start++;
            } else if (!vowel(ch[end])) {
                end--;
            } else {
                char temp =ch[start];
                ch[start]=ch[end];
                ch[end] = temp;

                start++;
                end++;


            }

            System.out.println( String.valueOf(ch));

        }

    }
   static boolean vowel( char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'||
                ch=='A'||ch=='E'||
                        ch=='I'|| ch=='O'|| ch=='U'){
            return true;
        }
            return false;

    }


}
