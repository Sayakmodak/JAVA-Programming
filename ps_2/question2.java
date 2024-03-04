package ps_2;
import java.util.Scanner;
class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject1: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter subject2: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter subject3: ");
        int sub3 = sc.nextInt();
        
        float avg = (sub1+sub2+sub3)/3.0f;
        System.out.println("Overall percentage is: " + avg);
        if(avg>40 && sub1>33 && sub2>33 && sub3>33){
            System.out.println("You Passed");
        }
        else{
            System.out.println("You failed");
        }
        sc.close();
    }
}