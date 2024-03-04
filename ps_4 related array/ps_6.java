public class ps_6 {
    public static void main(String[] args) {
        int arr[] = {20,30,10,50,40} ;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i] ;
            }
        }
        System.out.println("Max is " + max);

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i] ;
            }
        }
        System.out.println("Min is " + min);
    }
}
