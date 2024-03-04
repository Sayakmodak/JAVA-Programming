import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        /*for(int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i) ;
        }*/
        // In reverse order
        int sum = 0;
        for(int i=10;i>=1;i--){
            System.out.println(num + "*" + i + "=" + num*i) ;
            sum = sum+num*i;
        }
        System.out.println("Sum of the multiplication table is: " + sum);
        sc.close();
    }
}
