//import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int userInput;
    public int rand;
    public int noOfguess = 0;

    int generate_randam_number(){
        Random randamNumber = new Random() ;
        rand = randamNumber.nextInt(50);
        return rand;
    }

    int take_user_input(){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number: ");
        userInput = sc.nextInt();
        sc.close();
        return userInput;
    }
    boolean Winner_of_the_Game(){
        noOfguess = noOfguess+1;
        
        if(rand==userInput){
            System.out.println("You guessed it right by " + noOfguess + "chance");
            return true;
        }
        else if(userInput>rand){
            System.out.println("Too high");
        }
        else if(userInput<rand){
            System.out.println("Too low");
        }
        return false;
        }
    }


public class guess_the_number {
    public static void main(String[] args){
    Game checkNumber = new Game();
    boolean b = false;
    while(b!=true){
        System.out.println(checkNumber.generate_randam_number());
        System.out.println("You entered " + checkNumber.take_user_input()); 
        b = checkNumber.Winner_of_the_Game(); // until it returs true
    }

}
}