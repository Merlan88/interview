package oop_practice.cat_dog.animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sound();
}