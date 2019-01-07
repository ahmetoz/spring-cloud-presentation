package com.presentation.account.repository;

import com.github.javafaker.Faker;
import com.presentation.account.domain.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    public Account findByName(String name) {
       switch (name.toLowerCase()) {
           case "friends" :
               return new Account("Friends", Faker.instance().friends().quote());
           case "thrones" :
               return new Account("Game of thrones", Faker.instance().gameOfThrones().quote());
           case "lotr" :
               return new Account("Lord of the rings", Faker.instance().lebowski().quote());
           case "yoda" :
               return new Account("Yoda", Faker.instance().yoda().quote());
       }

       return new Account(name, "Lorem ipsum dor amet!");
    }
}
