package com.felici.blogapinamsan.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * author: felici
 */
@Getter
@Setter
public class AddUserRequest {
    private String email;
    private String password;
}


