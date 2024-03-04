import java.util.Arrays;
public class sorting_of_an_array {
    public static void main(String[] args) {
        int arr[] = {20, 50, 30, 40, 90};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
