package com.amin.prototype;

import com.amin.model.SomeClass;

public class Prototype {


    public static void main(String[] args) {
        SomeClass a = new SomeClass();
        SomeClass b = a;

        // this also changes a.someField
        // since a and b refer to the same thing
        b.someField = 5;
    }

    public static void main2(String[] args) throws CloneNotSupportedException {
        SomeClass a = new SomeClass();
        a.someField = 1202;

        SomeClass b = a.clone();
        // a.someField remains 1202
        // since it is a different object
        b.someField = 5;
    }
}
