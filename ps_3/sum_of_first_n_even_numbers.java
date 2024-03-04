import java.util.Scanner;
public class sum_of_first_n_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int i=1,sum=0;
        System.out.println("Even number are: ");
        while (i<=num) {
            if(i%2==0){
                System.out.print("\t" + i);
                sum=sum+i;
            }
        i++;
        }
        System.out.print("\n");
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
