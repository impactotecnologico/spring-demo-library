package net.impactotecnologico.librarydemo.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.google.common.base.MoreObjects;

@Entity
@Table(name = "libros")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nombre", nullable = false)
    private String name;

    @NotNull
    @Column(name = "autores", nullable = false)
    private String author;

    @NotNull
    @Column(name = "estado")
    private boolean state;

    public Book(Long id, String name, String author, boolean state) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.state = state;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }


    /**
     * @return the state
     */
    public boolean isState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id).add("name", name)
                .add("author", author).add("state", state).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, state);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Book) {
            Book that = (Book) object;
            return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
                    && Objects.equals(this.author, that.author) && this.state == that.state;
        }
        return false;
    }



}
