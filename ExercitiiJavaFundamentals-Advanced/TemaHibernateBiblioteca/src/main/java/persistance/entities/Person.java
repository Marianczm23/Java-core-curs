package persistance.entities;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@NamedQueries({
        @NamedQuery(name="delete_Person_By_Age",query="delete Person where person_year_of_birth=:age"),
        @NamedQuery(name="find_Person_By_Surname",query="select person from Person person where person_surname=:surname"),
        @NamedQuery(name="select_Person_By_Address",query="select person from Person person where person_address=:address")
})



@Entity
@Table(name="Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "person_name")
    private String name;
    @Column(name = "person_surname")
    private String surname;
    @Column(name = "person_address")
    private String address;
    @Column(name = "person_year_of_birth")
    private Date yearOfBirth;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Set<Author> author;


    public Person(String name,String surname,String address,Date yearOfBirth){
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.yearOfBirth=yearOfBirth;
    }

    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name +
                ", surname='" + surname +
                ", address='" + address  +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
