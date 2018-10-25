package net.impactotecnologico.librarydemo.repository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.impactotecnologico.librarydemo.model.Book;
import net.impactotecnologico.librarydemo.model.Member;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    /**
     * 
     * Requerimiento: Los libros cuyo plazo de devolución ha caducado
     * 
     * @param dateToCheck
     * @return
     */
    List<Book> getExpiredLoanByDate(LocalDateTime dateToCheck);

    /**
     * 
     * Requerimiento: Qué libros tiene un usuario
     * 
     * @param member Usuario a consultar
     * @return retorna la lista de libros que tiene el usuario
     */
    List<Book> getBooksByMember(Member member);

}
