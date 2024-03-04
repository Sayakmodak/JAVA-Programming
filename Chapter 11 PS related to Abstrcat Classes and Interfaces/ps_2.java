package CodeWithHarry;
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep(); 
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    
}
public class ps_2 {
    public static void main(String[] args) {
        Human huu = new Human();
        huu.bite();
        huu.eat();

        Monkey mon = new Human();
       // mon.eat(); --> The reference is Monkey which does not have eat method (Polymrophism)
       mon.jump();

       BasicAnimal b = new Human();
       //b.bite(); --> The reference is Monkey which does not have eat method (Polymrophism)
       b.eat();
    }
}
