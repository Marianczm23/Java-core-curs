package persistance.DAO;

import Config.HibernateUtil;
import persistance.entities.Person;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class PersonDAO {

    public void insertPerson(Person person){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }
    public List<Person> personListBySurname(String surname){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Query findPersonBySurname = session.createNamedQuery("find_Person_By_Surname");
        findPersonBySurname.setParameter("surname","Cozma");
        List<Person> personBySurname = findPersonBySurname.getResultList();
        session.getTransaction().commit();
        session.close();
        return personBySurname;

    }



}
