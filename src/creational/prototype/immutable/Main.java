package creational.prototype.immutable;

import creational.prototype.Breed;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat(Breed.BENGAL,7);
        Cat cat2 = (Cat) cat1.clone();
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
