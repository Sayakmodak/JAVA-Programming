class parent{
    int id;
    int age;
    String name;

    parent(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
class child extends parent{
    String address;
    child(int id, int age, String name, String address){
        super(id,age,name);
        this.address = address;
    }
    void display(){
       System.out.println(id+" "+name+" "+age+" "+address);
  }
}
public class super_example {
    public static void main(String[] args) {
        child c = new child(1, 10, "Raju", "Kolkata");
        c.display();
    }
}
