/*  output

RAJARAMMOHANROY
rajarammohanroy
false
false
false
false
true
a
7
1
10
15
RamMohanRoy
RamMoha
*/


public class jMethods {
  public static void main(String args[]){
      String s1 ="RajaRamMohanRoy";
      System.out.println(s1.toUpperCase());
      System.out.println(s1.toLowerCase());
      System.out.println(s1.startsWith("raja"));
      System.out.println(s1.startsWith("rani"));
      System.out.println(s1.endsWith("roy"));
      System.out.println(s1.endsWith("pay"));
      System.out.println(s1.contains("Mohan"));
      System.out.println(s1.charAt(5));
      System.out.println(s1.indexOf('M'));
      System.out.println(s1.indexOf('a'));
      System.out.println(s1.lastIndexOf('a'));
      System.out.println(s1.length());
      System.out.println(s1.substring(4));
      System.out.println(s1.substring(4,11));
  }
}
