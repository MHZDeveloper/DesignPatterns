package FactoryMethod;

import FactoryMethod.creator.JsonMessageCreator;
import FactoryMethod.creator.MessageCreator;

public class Main {

    public static void main(String[] args) {
        MessageCreator creator = new JsonMessageCreator();
        System.out.println(creator.getMessage().getContent());
    }
}
