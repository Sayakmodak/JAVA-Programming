public class ps_7 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 20};
        boolean isSorted = true;
        
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
           }
        }
        if(isSorted)
        {
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not");
        }
    }
}
