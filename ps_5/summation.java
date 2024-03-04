import java.util.Scanner;
public class summation {
    static int sum_of_natural_numbers(int x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        else{
            return x + sum_of_natural_numbers(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("The sum is " + sum_of_natural_numbers(num));
        sc.close();
    }
}
