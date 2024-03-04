package Access_Modifier;
class setter_getter{
    private int id;
    private String name;

    public void setId(int e_id){
        id = e_id;
    }
    public void getId(){
        System.out.println(id);
    }
    public void setName(String n){
        name = n;
    }
    public void getName(){
        System.out.println(name);
    }
    public setter_getter(){
        
    }
}
public class getter_and_setter {

    public static void main(String[] args) {
        setter_getter s_g = new setter_getter();
        s_g.setId(10);
        s_g.getId();

        s_g.setName("Raju");
        s_g.getName();
    }
}