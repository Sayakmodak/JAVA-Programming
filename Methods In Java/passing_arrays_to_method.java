//          In the case of arrays reference of the array is passed

public class passing_arrays_to_method {
    static void change_the_array(int array[]){
        array[0] = 25;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,40,50,60};
        change_the_array(arr);
        System.out.println(arr[0]);
    }
}
