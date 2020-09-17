package FactoryMethod.message;

public class JsonMessage extends Message {

    @Override
    public String getContent() {
        return "this is a json message !!";
    }
}
