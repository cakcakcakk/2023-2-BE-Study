package org.example;

public class Dog extends Animal {
    private String name;

    public String getName(){
        return this.name;
    }

    public Dog(String name){
        this.name=name;
    }
    public void speak() {

        System.out.println(this.getName()+" says Woof!");
    }
}
