package net.impactotecnologico.librarydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.impactotecnologico.librarydemo.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {



}
