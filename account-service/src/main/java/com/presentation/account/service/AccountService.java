package com.presentation.account.service;

import com.presentation.account.domain.Account;

public interface AccountService {

    Account findByName(String name);
}
