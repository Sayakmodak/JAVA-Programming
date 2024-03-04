import java.util.Scanner;
import java.util.Random;

public class stone_paper_sizer {
    public static void main(String[] args){
        Random rand = new Random();
        int computer = rand.nextInt(3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice 0 for stone, 1 for paper, 2 for sizer: ");
        int user = sc.nextInt();
        System.out.println("You choosed " + user);
        System.out.println("Computer choosed " + computer);

        if(user==computer){
            System.out.println("Nobody Win");
        }
        else if(user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1 || user==0 && computer==1){
            System.out.println("User Win");
        }
        else{
            System.out.println("Computer Win");
        }
        sc.close();
    }
}
