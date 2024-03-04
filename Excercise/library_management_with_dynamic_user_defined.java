import java.util.Scanner;
class library_Management{
    Scanner sc = new Scanner(System.in);
    String books[] = new String[100];
    int no_of_books = 0;
    public void addBooks(){
        System.out.println("Enter the name of the book: ");
        String book = sc.nextLine();
        books[no_of_books] = book;
        no_of_books++;

        System.out.println(book + " has been added...");
    }
    public void showBooks(){
        for(int i=0;i<this.books.length;i++){
           if(books[i]==null){
                continue;
            }
            System.out.println("* " + books[i]);
        }
    }
    public void issedBooks(){
        System.out.println("Enter the name of the book: which will be going to be issued");
        String book = sc.nextLine();
        for(int i=0;i<this.books.length;i++){
            if(books[i].equals(book)){
                System.out.println(book + " has been issued");
                books[i] = null; 
                return;
            }
        }
        System.out.println(book + " is not available");
    }
    public void returnBook(){
        System.out.println("Enter the name which will be going to be returned");
        String book = sc.nextLine();
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been returned and added");
    }
}
public class library_management_with_dynamic_user_defined {
    public static void main(String[] args) {
    library_Management libm = new library_Management();
    libm.addBooks();
    libm.addBooks();
    libm.addBooks();
    libm.showBooks();
    libm.issedBooks();
    libm.showBooks();
    libm.returnBook();
    libm.showBooks();
    }
}
