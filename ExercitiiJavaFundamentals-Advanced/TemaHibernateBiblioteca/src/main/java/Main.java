import persistance.DAO.AuthorDAO;
import persistance.DAO.BookDAO;
import persistance.entities.Author;
import persistance.entities.Book;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Jules Vernes",4,"Novel",true,false);
        BookDAO bookDAO = new BookDAO();
        bookDAO.insertBook(book);

        Author author1 = new Author("vasile");
        AuthorDAO authorDAO = new AuthorDAO();

        authorDAO.insertAuthor(author1);
        authorDAO.searchAuthorByName("vasile");
    }
}
