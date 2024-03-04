// Method overloading means name of the methods are same but parametres must be different
public class method_overloading {
    static void overloading(){
        System.out.println("Hello bro!");
    }
    static void overloading(String name){
        System.out.println("Hello " + name + " bro!");
    }
    public static void main(String[] args) {
        overloading();
        overloading("Raja");
    }
    
}
