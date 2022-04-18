package com.tenpo.transaction.security.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserLoginDTO {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
