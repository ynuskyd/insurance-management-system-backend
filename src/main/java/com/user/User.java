package com.user;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(schema = "insurance", name = "user")
public class User {

    @NotNull
    UserRole userRole;

    @NotNull
    String name;

    @NotNull
    String surname;

    @NotNull
    @Id
    String email;

    @NotNull
    String password;

    @NotNull
    String job;

    @NotNull
    String age;

    @NotNull
    String addressList;

    @NotNull
    Date lastLoginDate;


}
