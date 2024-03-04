import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subject1: ");
        int sub1 = sc.nextInt(); 
        System.out.print("Enter the number of subject2: ");
        int sub2 = sc.nextInt(); 
        System.out.print("Enter the number of subject3: ");
        int sub3 = sc.nextInt(); 
        System.out.print("Enter the number of subject4: ");
        int sub4 = sc.nextInt(); 
        System.out.print("Enter the number of subject5: ");
        int sub5 = sc.nextInt(); 
        int sum = (sub1+sub2+sub3+sub4+sub5) ;
        float percenTage = (sum * 100)/500 ;
        System.out.println("The percentage of is " + percenTage);
        sc.close();
    }
    
}
