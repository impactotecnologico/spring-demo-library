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
@Table(name = "socios")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nombres", nullable = false)
    private String name;

    @NotNull
    @Column(name = "apellidos", nullable = false)
    private String lastname;

    public Member(Long id, @NotNull String name, @NotNull String lastname) {
        super();
        this.id = id;
        this.name = name;
        this.lastname = lastname;
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id).add("name", name)
                .add("lastname", lastname).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Member) {
            Member that = (Member) object;
            return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
                    && Objects.equals(this.lastname, that.lastname);
        }
        return false;
    }



}
