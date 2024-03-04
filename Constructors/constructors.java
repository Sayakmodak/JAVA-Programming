class Example_of_Contructors{
    public Example_of_Contructors(){
        System.out.println("This is without parametres");
    }
    public Example_of_Contructors(int id, String name){
        System.out.println("This is with parametres");
    }
    
}
public class constructors{
    public static void main(String[] args) {
    Example_of_Contructors exmp1 = new Example_of_Contructors(); // "This is without parametres"
    Example_of_Contructors exmp2 = new Example_of_Contructors(10, "Raju"); // "This is with parametres"


    }
}