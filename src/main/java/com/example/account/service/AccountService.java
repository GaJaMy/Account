package com.example.account.service;

import com.example.account.domain.Account;
import com.example.account.domain.AccountStatus;
import com.example.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor //꼭필요한 Arg가 필요한 생성자를 만들어줌
public class AccountService {
    private final AccountRepository accountRepository;


    @Transactional
    public void createAccount(Long userId, Long initialBalance) {

    }

    @Transactional
    public Account getAccount(Long id) {
        return accountRepository.findById(id).get();
    }
}
