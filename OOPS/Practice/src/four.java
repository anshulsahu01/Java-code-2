public class four {
    String name;
    int rollno;

    four(String n,int r){
        this.name=n;
        this.rollno=r;
    }
    four(){
        this.name =name;
        this.rollno=rollno;
    }

    //hr baar this default value dega jese hi argument or parameter match
// honge value daal dega

    public static void main(String[] args) {
        four f=new four("anshul " , 5401);
        four f2=new four("bobby " , 2104);
        four f3=new four();


        System.out.println(f.name+""+f.rollno);
        System.out.println(f2.name+""+f2.rollno);


        System.out.println(f3.name+""+f3.rollno);
    }
}
