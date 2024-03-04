import java.util.Scanner;
public class one_D_array {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size] ;
    // Taking inputs for the array
    System.out.println("Enter elements for the array");
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }

    // Printing the elements
    System.out.println("Printing the elements");
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    sc.close();
}
    
}