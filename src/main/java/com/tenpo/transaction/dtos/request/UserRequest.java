package com.tenpo.transaction.dtos.request;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
public class UserRequest {
    
    private String email;
    private String password;
    
}