interface sampleInterface1{
    void meth1();
    void meth2();
}
interface sampleInterface2 extends sampleInterface1{
    void meth3();
    void meth4();
}
class sampleClass implements sampleInterface2{
    public void meth3(){
        System.out.println("This is method 3");
    }
    public void meth4(){
        System.out.println("This is method 4");
    }
    // Because it is inheriting the sampleInterface1
    public void meth1(){
        System.out.println("This is method 1");
    }
    public void meth2(){
        System.out.println("This is method 2");
    }
}
public class inheritance_in_interfaces {

    public static void main(String[] args) {
        sampleClass smpc = new sampleClass();
        smpc.meth1();
        smpc.meth2();
        smpc.meth3();
        smpc.meth4();
    }
}