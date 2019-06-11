package com.thoughtworks.tdd;

public class FizzBuzz {
    private Dependency dependency;

    public FizzBuzz(Dependency dependency) {
        this.dependency = dependency;
    }

    public String beenCalled() {
        return dependency.fizzBuzzResult();
    }



}
