package com.example.account.repository;

import com.example.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findFirstByOrderByIdDesc();
    //Optional을 쓰면 실제 사용할 때 스트림으로 if-else문 처럼 쓸 수 있다
    //솔직히 스트림쓰면서 람다식 쓰는거 별로 안좋아 보임...
}
