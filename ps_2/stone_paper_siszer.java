package ps_2;
import java.util.Random;
import java.util.Scanner;
class stone_paper_siszer{
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you 0 for rock 1 for paper 2 for sizer: ");
        int user = sc.nextInt();
        System.out.println("User choose: " + user);
        Random rand = new Random();
        int comp = rand.nextInt(3);
        System.out.println("Computer choose: " + comp);
        // 0 --> rock
        // 1 --> paper
        // 2 --> sizer

        if(comp==user){
            System.out.println("Nobody Win");
        }
        else if(comp==0 && user==1 || comp==2 && user==0 || comp==1 && user==2){
            System.out.println("User Win");
        }
        else{
            System.out.println("Computer Win");
        }
    sc.close();
    }
}
