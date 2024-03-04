public class finding_an_element_in_the_array {
    public static void main(String[] args) {
        int arr[] = {2,50,32,48,26};
        int isPresent = 0;
        int flag = 48;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==flag){
                isPresent = 1;
                break;
            }
        }
        if(isPresent==1){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
}
