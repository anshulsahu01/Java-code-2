public class Encapsulation {

    public static void main(String args[]){
        pageNo c=new pageNo();
        c.setPageNo(100);
        System.out.print(c.getPageNo());

    }
}
class pageNo{
    private  int PageNO;

    int PageNo;
    void setPageNo(int x){
        if (x>=0){
            PageNo = x;
        }else{
            System.out.print("invalid");
        }
    }
    int getPageNo(){
        return PageNo;
    }
}
