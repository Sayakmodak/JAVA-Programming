public class multiplication_table {
    static void multiplication(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a + "*" + i + "=" + (a*i));
        }
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Multiplication of " + num + " is: ");
        multiplication(num);
    }
}