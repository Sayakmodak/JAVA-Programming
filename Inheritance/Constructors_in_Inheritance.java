class Base{
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int a){
        System.out.println("I am a constructor with value " + a);
    }
}
class Derived extends Base{
    Derived(){
        super(10);
        System.out.println("I am a Derived constructor");
    }
}
public class Constructors_in_Inheritance {

    public static void main(String[] args) {
    Base b = new Base();
    Derived d = new Derived();

    }
}