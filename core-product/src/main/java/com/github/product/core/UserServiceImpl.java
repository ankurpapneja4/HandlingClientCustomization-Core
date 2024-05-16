package com.github.product.core;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    public User getUser() {
        return User.builder()
                .id( UUID.randomUUID() )
                .name( "Kumar")
                .build();
    }

    @Override
    public Status deleteUser() {
        return Status.builder()
                .statusCode(HttpStatus.ACCEPTED.value())
                .message( "User Deleted" )
                .build();
    }

}
