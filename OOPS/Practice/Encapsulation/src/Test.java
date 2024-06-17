class Personn{
    private  String name;
    private int age;

    public void setname(String name){
        this.name=name;

    }
    void setAge(int age){
        this.age =age;
    }
    public String getname(){
        return name;
    }

    int getAge(){
        return age;
    }

}
public class Test {
    public static void main(String[] args) {
        Personn p =new Personn();
        p.setname("anshul");
        p.setAge(22);
        System.out.println(p.getname()+"   "+ p.getAge());
    }
}
