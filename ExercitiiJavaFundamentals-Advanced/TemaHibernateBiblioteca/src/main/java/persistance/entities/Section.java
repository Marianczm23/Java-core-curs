package persistance.entities;
import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name="select_Section_Name",query="select section from Section section where section_name=:sectionName")
})
@Entity
@Table(name="Section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "section_name")
    private String sectionName;
    @OneToOne(mappedBy = "section",cascade = CascadeType.ALL)
    private Book book;

    public Section(String sectionName){
        this.sectionName=sectionName;
    }

    public Section(){

    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName +
                '}';
    }
}
