import java.util.Scanner;
public class array_addition {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number of the 1st array");
        int row1 = sc.nextInt();
        System.out.println("Enter the column number of the 1st array");
        int col1 = sc.nextInt();

        int arr[][] = new int [row1][col1];

        // Taking inputs
        System.out.println("Enter the values:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the values
        System.out.println("Printing the values");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


        System.out.println("Enter the row number of the 2nd array");
        int row2 = sc.nextInt();
        System.out.println("Enter the column number of the 2nd array");
        int col2 = sc.nextInt();

        int arr2[][] = new int [row2][col2];

        // Taking inputs
        System.out.println("Enter the values:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        // Printing the values
        System.out.println("Printing the values");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // Array Addition
        System.out.println("sum of the array is: ");
        int sum[][] = new int [row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                sum[i][j] = arr[i][j] + arr2[i][j] ;
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        sc.close();
    }


}
