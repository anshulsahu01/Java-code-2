public class Test {
    public int age ;
    String name;
    Test(int age ,String name){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Test t=new Test(33 ,"anshul");
        System.out.println("hey");
    }
}
