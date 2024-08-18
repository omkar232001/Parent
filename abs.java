package Abstraction;
abstract class e{
    abstract int r(int a,int b);
    void tr(){
        System.out.println("Method");
    }
}
class we extends e{
    @Override
    int r(int a,int b) {
        int t=a+b;
        System.out.println("Addition =" +t);
        return t;
    }
}
public class abs {
    public static void main(String[] args) {
        we jh=new we();
        jh.r(5,9);
        jh.tr();
    }
}
