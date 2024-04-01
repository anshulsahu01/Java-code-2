public class findCh {
    public static void main(String[] args) {

        String input="r$3y@o9hy#*a&r";

        int numbers=0;
        int Alphabets=0;
        int SC=0;

        for(int i=0; i<input.length();i++){
             char ch =input.charAt(i);

             if(ch>='0'&&ch<='9'){
                 numbers++;
             } else if (ch>='a'&& ch<='z'||ch>='A'&& ch<='Z') {
                 Alphabets++;

             }else {
                 SC++;
             }


        }
        System.out.println("numbers:="+numbers +"Alphabets="+Alphabets+ " SC="+ SC);
    }
}
