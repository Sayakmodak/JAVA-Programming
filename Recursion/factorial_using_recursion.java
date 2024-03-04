import java.util.Scanner;
public class factorial_using_recursion {
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a * factorial(a-1); 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is : " + factorial(num));
        sc.close();
    }
}