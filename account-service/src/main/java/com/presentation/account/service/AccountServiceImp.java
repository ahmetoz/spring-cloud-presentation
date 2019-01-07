package com.presentation.account.service;

import com.presentation.account.domain.Account;
import com.presentation.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account findByName(String name) {
        return accountRepository.findByName(name);
    }
}
