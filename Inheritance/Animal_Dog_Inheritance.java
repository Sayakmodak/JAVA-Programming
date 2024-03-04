//import Animal.Dog;

class Animal{
    String barking_sound;
    public String getbarking_sound(){
        return barking_sound;
    }
    public String setbarking_sound(String barking_sound) {
        return this.barking_sound = barking_sound;
    }
}
class Dog extends Animal{
        String barking_soundOfDog;
        public String getbarking_soundDog() {
            return barking_soundOfDog;
        }
        public String setbarking_soundDog(String barking_soundOfDog) {
            return this.barking_soundOfDog = barking_soundOfDog;
        }
    }
public class Animal_Dog_Inheritance {
    public static void main(String[] args) {
    Animal a = new Animal();
    a.setbarking_sound("Common Sound") ; 
    System.out.println(a.getbarking_sound());

    Dog d = new Dog();
    d.setbarking_soundDog("Bark");
    System.out.println(d.getbarking_soundDog());

    d.setbarking_sound("Miew");
    System.out.println(d.getbarking_sound());
    }
    
}
