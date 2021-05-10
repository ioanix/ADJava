package com.reflection;

import com.ch2.FooBarQuix;

import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {

        System.out.println(FooBarQuix.class.getSuperclass());

        int i = FooBarQuix.class.getModifiers();

        System.out.println(Modifier.toString(i));
    }
}
