public class ps_2 {
    public static void main(String[] args) {
      float arr[] = {2.5f,35.0f,2.6f,45.9f,25.8f};
      float flag = 25.8f;
      boolean isPresent = false;
       for (float f : arr) {
            if(flag==f){
                isPresent = true;
                break;
            }
        }
        if(isPresent){
            System.out.println("Present");
        }
       else{
            System.out.println("It is not present in the array");
        }
    }
        
}
