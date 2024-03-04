import java.util.Scanner;
public class pattern {
    static void pattern_print(int x){
        for(int i=0;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        pattern_print(num);
        
        sc.close();
    }
}
