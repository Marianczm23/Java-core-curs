package persistance.DAO;
import Config.HibernateUtil;
import persistance.entities.Author;
import org.hibernate.Session;
import javax.persistence.Query;
import java.util.List;

public class AuthorDAO {
    public void insertAuthor(Author author){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();

    }
    
    public List<Author> searchAuthorByName(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query searchAuthorByNameQuery = session.createNamedQuery("search_Author_By_Name");
        searchAuthorByNameQuery.setParameter("name",name);
        List<Author> authorList = searchAuthorByNameQuery.getResultList();
        for(Author author : authorList){
            System.out.println(author);
        }
        session.getTransaction().commit();
        session.close();
        return authorList;
        
    }


}
