package com.github.product.core;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    
    private UUID id;

    private String name;

    public User( User user){
        this.id = user.id;
        this.name = user.name;
    }
}
