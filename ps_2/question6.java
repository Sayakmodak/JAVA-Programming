package ps_2;
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the form of the url : ");
        String url = sc.next();

        /*switch (str) {
            case ".com":
                System.out.println("Commercial website");
                break;
            case ".in":
            System.out.println("Indian website");
            break;
            case ".org":
            System.out.println("Organizational Website");
            break;
            default:
                System.out.println("None of these");
        }*/
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Indian website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organizational Website");
        }
        else{
            System.out.println("Not specified");
        }
        sc.close();
    }
}
