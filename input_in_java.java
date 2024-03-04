import java.util.Scanner;
public class input_in_java {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b = sc.nextInt();
        System.out.println("The number is " + a);
        System.out.println("The number is " + b);
        int sum = a+b;
        System.out.println(sum);
        System.out.println("Enter float number: ");
        float x = sc.nextFloat();
        System.out.println("The float number is " + x);*/
        
        /*boolean b1 = sc.hasNextInt();
        System.out.println(b1);*/

        System.out.println("Enter your name: "); 
       // String str =  sc.next(); // It does not display after the space
       Strings str = sc.nextLine(); // It does  display after the space
        System.out.println(str);
        sc.close();
    }
}
