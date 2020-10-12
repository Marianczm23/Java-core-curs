package persistance.DAO;

import Config.HibernateUtil;
import persistance.entities.Section;
import org.hibernate.Session;

public class SectionDAO {
    public void insertSection(Section section){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(section);
        session.getTransaction().commit();
        session.close();
    }



}
