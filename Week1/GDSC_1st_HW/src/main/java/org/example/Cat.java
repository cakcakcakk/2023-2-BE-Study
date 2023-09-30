package org.example;

public class Cat extends Animal{
    private String name;

    public String getName(){
        return name;
    }

    public Cat(String name){
        this.name=name;
    }

    public void speak(){
        System.out.println(this.getName()+" says Meow!");
    }
}