package com.design_patterns.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter //All getter, and NO setter to provide immutability
@ToString
@Builder
public class AnnotatedUser {

    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

}
