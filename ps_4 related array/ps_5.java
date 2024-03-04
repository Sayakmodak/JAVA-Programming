// Reverse an array
import java.util.Scanner;
public class ps_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter the values");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing the array");
        for(int elm:arr){
            System.out.println(elm);
        }
        System.out.println("Printing reverse the array");
        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}