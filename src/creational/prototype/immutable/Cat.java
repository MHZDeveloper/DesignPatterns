package creational.prototype.immutable;

import creational.prototype.Breed;

public class Cat implements Cloneable{

    private Breed breed;
    private int age; // in months

    public Cat(Breed breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("error when cloning cat");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                ", age=" + age +
                '}';
    }
}
