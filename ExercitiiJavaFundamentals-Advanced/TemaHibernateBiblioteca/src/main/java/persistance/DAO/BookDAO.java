package persistance.DAO;


import Config.HibernateUtil;
import persistance.entities.Book;
import org.hibernate.Session;

public class BookDAO {

    public void insertBook(Book book){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }




}
