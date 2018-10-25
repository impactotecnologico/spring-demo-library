package net.impactotecnologico.librarydemo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.impactotecnologico.librarydemo.model.Book;
import net.impactotecnologico.librarydemo.model.Loan;
import net.impactotecnologico.librarydemo.repository.LoanRepository;
import net.impactotecnologico.librarydemo.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanRepository loanRepository;

    @Override
    public Loan getLoanDetailsByBook(Book book) {

        // añadiría algunas validaciones previas al retorno

        return this.loanRepository.getLoanDetailsByBook(book.getId());
    }

    @Override
    public List<Loan> getAvailableBooks() {

        return this.loanRepository.getAvailableBooks();
    }


}
