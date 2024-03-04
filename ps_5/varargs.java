public class varargs {
    static void average(int ...arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i] ; 
        }
        System.out.println(sum/(arr.length))  ;
    }
    public static void main(String[] args) {
        average(10,20,30,40,50);
    }
}
