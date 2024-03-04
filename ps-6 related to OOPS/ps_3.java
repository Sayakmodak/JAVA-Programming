class Tommy{
    String name;
    public void running(){
        System.out.println(name + " is running");
    }
    public void eating(){
        System.out.println(name + " is eating");
    }
    public void changeName(String nm){
        name = nm;
    }
}
public class ps_3 {
    public static void main(String[] args) {
        Tommy tm = new Tommy();
        tm.name = "Tommy";
        tm.running();
        tm.eating();

        System.out.print("Now ");
        tm.changeName("Kitty");
        tm.running();
        System.out.print("Now ");
        tm.eating();
    }
}
