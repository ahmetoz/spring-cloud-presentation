package com.presentation.account.domain;

public class Account {

    private String name;
    private String quote;

    public Account() {
    }

    public Account(String name, String quote) {
        this.name = name;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
