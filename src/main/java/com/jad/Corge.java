package com.jad;

public class Corge {

    private final Foo foo;

    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Corge(Foo foo) {
        this.foo = foo ;
    }
}

