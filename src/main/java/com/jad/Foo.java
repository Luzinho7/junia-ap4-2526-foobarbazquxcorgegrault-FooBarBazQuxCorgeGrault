package com.jad;

public class Foo {

}
    private Bar bar = new Bar();

    private List<Baz> bazs = new ArrayList<>();

    private Qux qux = new Qux();

    private Corge corge;

    private List<Grault> graults = new ArrayList<>();

    public Foo(Bar bar) {
        this.bar = bar;
}
    public void addBaz(Baz baz){
        this.bazs.add(baz);
}
    public void addGrault(){
        this.graults.add(new Grault(this));
}