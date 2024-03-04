abstract class Parent{
    public void greet(){
        System.out.println("Good Morning");
    }
    abstract public void hello();    // --> Override
    abstract public void greet2();    // --> Override
}
class Child1 extends Parent{
    // Above two abstract methods must be used in child class 
    @Override
    public void hello(){
        System.out.println("Hello");
    }
    @Override
    public void greet2(){
        System.out.println("Greeting");
    }
}
abstract class Child2 extends Parent{
    public void On(){
        System.out.println("Turning on...");
    }
}
public class first_abstract_class {

    public static void main(String[] args) {
    // Parent p = new Parent();  --> Not possible to create object of an abstract class

    Child1 c = new Child1();

    //Child2 c2 = new Child2();  --> Not possible to create object of an abstract class
    
    c.hello();
    }
}


