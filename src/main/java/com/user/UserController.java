package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//kullanıcı istekleri kontrol edecek

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/users")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createUser(@RequestBody User user) {

        userService.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body("user successfully created");

    }

    @GetMapping("/api/users")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> showUserList() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());

    }

}
