public class continue_ {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
              if(i==7){
            System.out.println("Skipping this iteration");
            continue;
        }
        System.out.print("iteration: " );
        System.out.println(i);
        }
    }
}
