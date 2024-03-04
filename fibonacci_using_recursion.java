import java.util.Scanner;
public class fibonacci_using_recursion {
    static int fibonacci(int n){
        if(n==0){
            return 0 ;
        }
        if(n==1 || n==2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2) ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        System.out.println("Fibonacci of " + num + " is: ");
        for(int i=0;i<num;i++){
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}