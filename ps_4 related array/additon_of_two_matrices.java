import java.util.Scanner;
public class additon_of_two_matrices {
    public static void main(String[] args) {
        int row1,col1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row of 1st matrix");
        row1 = sc.nextInt();
        System.out.println("Enter the number of column of 1st matrix");
        col1 = sc.nextInt();

        int mat1[][] = new int[row1][col1];

        // Taking inputs
        System.out.println("Enter the elements");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        System.out.println("Printing the array");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(mat1[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

        // For the 2nd matrix

        System.out.println("Enter the row number for 2nd matrix");
        int row2 = sc.nextInt();
        System.out.println("Enter the column number for 2nd matrix");
        int col2 = sc.nextInt();

        int mat2[][] = new int [row2][col2] ;

        System.out.println("Enter elements for 2nd matrix");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Printing the elements");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(mat2[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }


        // Addition 
        int sum[][] = new int [row1][col2];
        System.out.println("Addition of the two arrays are:");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j] ;
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("\n");
        }
        

        sc.close();
    }
}
