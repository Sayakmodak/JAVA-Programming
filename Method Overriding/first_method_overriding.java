class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }
}
public class first_method_overriding {
    public static void main(String[] args) {
    A a = new A();
    B b = new B();
    a.meth1();    
    b.meth1();    

    }

    
}