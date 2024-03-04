class Library{
    String books[] = new String[100];
    int no_of_books = 0;
    
    public void addBooks(String book){
        this.books[no_of_books] = book; 
        no_of_books++;
        System.out.println(book + " has been added...");
    }
    public void showBooks(){
        for(int i=0;i<books.length;i++){
            if(books[i]==null){
                continue;
            }
            System.out.println("* " + books[i]);
        }
    }
    public void issedBooks(String book){
        for(int i=0;i<this.books.length;i++){
            if(books[i].equals(book)){
                System.out.println("This book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book is not available");
    }
    public void returnBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been returned and added");
    }
}
public class library_management{
    public static void main(String[] args) {

    Library centralLibrary = new Library();
    centralLibrary.addBooks("C++");
    centralLibrary.addBooks("Python");
    centralLibrary.showBooks();
    centralLibrary.issedBooks("C++");
    centralLibrary.showBooks();
    centralLibrary.returnBook("C++");
    centralLibrary.showBooks();
    }
}