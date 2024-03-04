public class varargs{
    static int sum(int ...arr){
        // It is available as arr[]

        int result = 0;
        for(int elm:arr){
            result = result + elm;
            
        }
        return result ;
    }
    public static void main(String [] args){
        System.out.println("Sum of 5 + 5 + 5 is: " + sum(5,5,5));
    }
}