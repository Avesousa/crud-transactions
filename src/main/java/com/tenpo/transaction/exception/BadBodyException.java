package com.tenpo.transaction.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BadBodyException extends Exception{

    private String message;

    public BadBodyException(String message) {
        this.message = message;
    }
}
