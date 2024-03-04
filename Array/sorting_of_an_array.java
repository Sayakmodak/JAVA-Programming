public class sorting_of_an_array {

    public static void main(String [] args){
        int arr[] = {10, 20, 30, 40, 70};
        boolean isSorted = true ;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}