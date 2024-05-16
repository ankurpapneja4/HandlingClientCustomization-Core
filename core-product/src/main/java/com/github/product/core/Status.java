package com.github.product.core;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Status {

    private int statusCode;

    private String message;
}
