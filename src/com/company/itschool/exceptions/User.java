package com.company.itschool.exceptions;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyNameException, ToLongNameException {
        if (name.length() == 0) {
            EmptyNameException emptyNameException = new EmptyNameException();
            throw emptyNameException;
        }
        if (name.length() > 10) {
            ToLongNameException toLongNameException = new ToLongNameException();
            throw toLongNameException;
        }
        this.name = name;

    }
}
