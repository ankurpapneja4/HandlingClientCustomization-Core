package com.github.product.core;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping( "/user" )
    public User user() {
        return userService.getUser();
    }

    @DeleteMapping( "/user" )
    public Status deleteUser() { return userService.deleteUser(); }
}
