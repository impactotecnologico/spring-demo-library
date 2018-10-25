package net.impactotecnologico.librarydemo.service;

import java.util.List;
import net.impactotecnologico.librarydemo.model.Book;
import net.impactotecnologico.librarydemo.model.Loan;

public interface LoanService {

    Loan getLoanDetailsByBook(Book book);

    List<Loan> getAvailableBooks();

}
