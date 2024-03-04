public class fibonacci {
    static int fibonacci(int count){
        if(count==0){
            return 0;
        }
        if(count==1 || count==2){
            return 1;
        }
        else{
            return fibonacci(count-2) + fibonacci(count-1);
        }
    }
    public static void main(String[] args) {
       int num = 10;
       for(int i=0;i<num;i++){
            System.out.print(fibonacci(i) + " ");
       }
    }
}
