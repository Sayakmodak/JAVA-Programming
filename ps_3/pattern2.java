import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int i=num;
        while(i>=1){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            i--;
        }
        sc.close();
    }
}
