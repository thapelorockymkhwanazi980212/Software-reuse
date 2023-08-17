
package bookapp;

import java.util.Scanner;
import za.ac.tut.Author;
import za.ac.tut.Book;
import za.ac.tut.BooksManager;

/**
 *
 * @author Thapelo Mkhwanazi
 */
public class BookApp {

    
    public static void main(String[] args)
    {
       BooksManager bm = new BooksManager();
       
        addBooksToList(bm);
        
        Book[] books = bm.getBooks();
        
        displayBooks(books);
       
    }
    
    public static void addBooksToList(BooksManager bm)
    {
        String name, title;
        Author author;
        Book book;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Please enter the name of author " + (i + 1) + ": ");
            name = sc.next();
            
            System.out.println("Please enter the title of the book for " +name +": ");
            title = sc.next();
            
            author = new Author();
            author.setName(name);
            
            book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            
            bm.addBook(book, i);
        }
    }
    
    public static void displayBooks(Book[] books)
    {
        
        for (int i = 0; i < 5; i++) 
        {
          String name = books[i].getAuthor().getName();
          String title = books[i].getTitle();
          
            System.out.println((i + 1) + "." + name + "->" + title);
        }
    }
    
}
