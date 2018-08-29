package com.java8.tutor.common;

import org.checkerframework.checker.index.qual.NonNegative;

import com.java8.tutor.common.annotations.NotNullOrBlank;

public class Person {
	
	public @NotNullOrBlank String name;
    public @NonNegative int age;

    public Person(@NotNullOrBlank String name, @NonNegative int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

}
