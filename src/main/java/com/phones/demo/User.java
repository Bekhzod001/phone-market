package com.phones.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {

    private Long id;
    private String username;
    private String phoneNumber;
    private String password;

}
