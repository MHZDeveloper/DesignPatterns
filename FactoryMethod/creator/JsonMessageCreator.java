package FactoryMethod.creator;

import FactoryMethod.message.JsonMessage;
import FactoryMethod.message.Message;

public class JsonMessageCreator extends MessageCreator {

    @Override
    public Message getMessage() {
        return new JsonMessage();
    }
}
