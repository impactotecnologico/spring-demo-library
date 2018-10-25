package net.impactotecnologico.librarydemo.model;

import java.time.Instant;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.google.common.base.MoreObjects;

@Entity
@Table(name = "prestamos")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "libro_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "socio_id", nullable = false)
    private Member member;

    @NotNull
    @Column(name = "fecha", nullable = false)
    private Instant dateOfLoan;

    public Loan(Long id, Book book, Member member, @NotNull Instant dateOfLoan) {
        super();
        this.id = id;
        this.book = book;
        this.member = member;
        this.dateOfLoan = dateOfLoan;
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
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * @return the member
     */
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return the dateOfLoan
     */
    public Instant getDateOfLoan() {
        return dateOfLoan;
    }

    /**
     * @param dateOfLoan the dateOfLoan to set
     */
    public void setDateOfLoan(Instant dateOfLoan) {
        this.dateOfLoan = dateOfLoan;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id).add("book", book)
                .add("member", member).add("dateOfLoan", dateOfLoan).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, book, member, dateOfLoan);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Loan) {
            Loan that = (Loan) object;
            return Objects.equals(this.id, that.id) && Objects.equals(this.book, that.book)
                    && Objects.equals(this.member, that.member)
                    && Objects.equals(this.dateOfLoan, that.dateOfLoan);
        }
        return false;
    }



}
