public class ps_3 {
    public static void main(String[] args) {
        float arr[] = {2.5f,35.0f,2.6f,45.9f,25.8f};
        float sum = 0;

        for (float f : arr) {
            sum=sum+f;
        }
        System.out.println("Average is " + sum/(arr.length));
    }
}
