public class StringMethods {
    public static void main(String[] args){
        String name = "John Doe" ;
        System.out.println(name.toLowerCase()); // Question1
        System.out.println(name.replace(" ","_")); // Question2

        String text = "This is a <|text|>";
        System.out.println(text.replace("<|text|>","line")); // Question3
 
        String str = "    Hello    ";
        System.out.println(str.trim());

        System.out.println("Dear Harry, this java course is nice. thanks");

        String text1 = "Hello this is a   text.";
        System.out.println(text1.indexOf("  "));
    }
}
