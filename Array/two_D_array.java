import java.util.Scanner;
public class two_D_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number of the array");
        int row = sc.nextInt();
        System.out.println("Enter the column number of the array");
        int col = sc.nextInt();

        int arr[][] = new int [row][col];

        // Taking inputs
        System.out.println("Enter the values:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the values
        System.out.println("Printing the values");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
