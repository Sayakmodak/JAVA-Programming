public class method{
    static int sum( int x,  int y){
        int sum;
        sum = (x+y);
        return sum;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        // Method invocation using Object Creation
        //method obj = new method();
        //int result = obj.sum(a, b);
        int result = sum(a, b);
        System.out.println("Sum is " + result);
    }
}