package com.amin.model;

public class SomeClass extends Object{

    public int someField;

    @Override
    public SomeClass clone() throws CloneNotSupportedException {
        return (SomeClass) super.clone();
    }
}
