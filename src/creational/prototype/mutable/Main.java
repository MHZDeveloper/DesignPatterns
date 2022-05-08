package creational.prototype.mutable;

import creational.prototype.Breed;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat(Breed.BENGAL,7);
        cat1.setOwner("Steve");
        Cat cat2 =  cat1.clone();

        System.out.println(cat1);
        System.out.println(cat2);

        cat2.getOwner().setName("Bill");

        System.out.println(cat1);
        System.out.println(cat2);
    }
}
