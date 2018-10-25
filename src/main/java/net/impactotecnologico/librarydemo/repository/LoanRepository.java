package net.impactotecnologico.librarydemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import net.impactotecnologico.librarydemo.model.Book;
import net.impactotecnologico.librarydemo.model.Loan;
import net.impactotecnologico.librarydemo.model.Member;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

    /**
     * 
     * Requerimiento: Quién tiene un libro (todos los datos del préstamo)
     * 
     * @param book Libro a buscar
     * @return retorna un objeto préstamo con el detalle del mismo
     */
    @Query("select prestamo from Loan prestamo where prestamo.book.id = ?1")
    Loan getLoanDetailsByBook(Long bookId);

    /**
     * 
     * Requerimiento: Qué libros están disponibles
     * 
     * @return Lista de libros con atributo status en true
     */
    @Query("select prestamo from Loan prestamo where prestamo.status = true")
    List<Loan> getAvailableBooks();

    /**
     * 
     * Requerimiento: Qué libros están prestados
     * 
     * @return Lista de libros con atributo status en false
     */
    @Query("select prestamo from Loan prestamo where prestamo.status = false")
    List<Loan> getBooksOnLoan();

    /**
     * 
     * Requerimiento: Cada vez que un socio solicita un libro a un bibliotecario (hay más de uno
     * trabajando en la biblioteca), éste se lo entrega y cambia el estado del libro
     * 
     * @param book libro a prestar
     * @param member socio que solicita el préstamo
     * @return Retorna el objeto préstamo creado
     */
    Loan lendBook(Book book, Member member);



}
