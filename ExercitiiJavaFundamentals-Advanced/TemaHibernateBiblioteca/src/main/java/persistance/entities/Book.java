package persistance.entities;
import javax.persistence.*;
import java.util.Set;

@NamedQueries({
        @NamedQuery(name="search_Book_By_Type",query="select book from Book book where book_type=:book_type"),
        @NamedQuery(name="search_Book_By_Title",query="select book from Book book where title=:title"),
        @NamedQuery(name="update_Book_Borrowed",query = "update Book set borrowed=:borrowed")
})

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="title")
    private String title;
    @Column(name="volume_number")
    private int volumeNumber;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="author_id")
    private Set<Author> authorSet;
    @Column(name="book_type")
    private String bookType;
    @Column(name="borrowed")
    private boolean borrowed;
    @Column(name="free")
    private boolean free;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "section_id")
    private Section section;


    public Book(String title,int volumeNumber,String bookType,boolean borowed,boolean free){
        this.title=title;
        this.volumeNumber=volumeNumber;
        this.bookType=bookType;
        this.borrowed=borowed;
        this.free=free;
    }

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
    }


    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorowed(boolean borowed) {
        this.borrowed = borowed;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title +
                ", volumeNumber=" + volumeNumber +
                ", bookType='" + bookType +
                ", borowed=" + borrowed +
                ", free=" + free +
                '}';
    }
}
