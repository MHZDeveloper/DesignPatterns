package FactoryMethod.creator;

import FactoryMethod.message.Message;
import FactoryMethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message getMessage() {
        return new TextMessage();
    }
}
