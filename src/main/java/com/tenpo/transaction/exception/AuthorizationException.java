package com.tenpo.transaction.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorizationException extends Exception{

    private String message;

    public AuthorizationException(String message) {
        this.message = message;
    }
}
