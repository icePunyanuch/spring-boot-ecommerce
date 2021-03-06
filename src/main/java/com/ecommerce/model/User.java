package com.ecommerce.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Data
@Accessors(chain = true)
public class User {
    private String id;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String phone;
    @NotNull
    private String name;

    private String lastLogin;
    private String createdDatetime;
    private String updatedDatetime;
}
