package Abstraction;
abstract class E1{
    abstract void e11();
    void e12(){
        System.out.println("Method");
    }
    abstract void e13();
}
abstract class E2 extends E1{
    abstract void e21();

    @Override
    void e11() {
        System.out.println("Abstract 1");
    }
}
class E3 extends E2{
    @Override
    void e13() {
        System.out.println("Abstract 2");
    }

    @Override
    void e21() {
        System.out.println("Abstract 3");
    }
}
public class ABST {
    public static void main(String[] args) {
        E2 obj=new E3();
        obj.e11();
        obj.e12();
        obj.e13();
        obj.e21();
    }
}
