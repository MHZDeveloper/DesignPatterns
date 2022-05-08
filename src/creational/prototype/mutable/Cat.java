package creational.prototype.mutable;

import creational.prototype.Breed;

public class Cat implements Cloneable{

    private Breed breed;
    private int age; // in months
    private Person owner;

    public Cat(Breed breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    protected Cat clone() {
        try {
            Cat cat = (Cat) super.clone();
            cat.owner = owner.clone();
            return cat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("error when cloning cat");
        }
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        this.owner = new Person(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}
