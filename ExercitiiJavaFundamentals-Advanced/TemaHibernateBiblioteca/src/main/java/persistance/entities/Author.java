package persistance.entities;
import javax.persistence.*;
import java.util.Set;

@NamedQueries({
        @NamedQuery(name= "search_Author_By_Name",query = "select author from Author author where name=:name" )

        })


@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Book book;
    @ManyToMany(mappedBy = "author")
    private Set<Person> personSet;
    @Column(name="name")
    private String name;

    public Author(String name){
        this.name=name;

    }
    public Author() {

    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Set<Person> getPerson() {
        return this.personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    @Override
    public String toString() {
        return "Author{" +
                ", person=" +
                '}';
    }
}
