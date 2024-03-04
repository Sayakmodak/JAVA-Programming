class accessModifier{
    private int radius;
    private int height;

    int getRadius(){
        return radius;
    }
    int setRadius(int radius){
        return this.radius = radius;
    }

    int getHeight(){
        return height;
    }
    int setHeight(int height){
        return this.height = height;
    }
}
public class ps_1{
    public static void main(String[] args) {
    accessModifier accm = new accessModifier();

    accm.setRadius(10);
    System.out.println(accm.getRadius());

    accm.setHeight(20);
    System.out.println(accm.getHeight());
    }
}