# Builder

This design pattern is used when creating objects of a class.

### When we use this design pattern ?

#### Class constructor requires a lot of information

An immutable object is an object whose properties cannot be changed once this object is created.


When we write immutable classes, we will end up with constructors with multiple parameters because we have to initialize all the properties.

Generally, having a method with a lot of parameters is considered a bad coding practice because anyone using such code has to find out what all the parameters mean by reading the documentation so that he could pass the correct values.

This design pattern helps us in 2 ways in this situation:

* Make easy the use of such constructors
* Avoid writing such constructors in first place

#### Objects that need other objects to construct them

In our example the object "Address" needs to be created before the object "User".

In other words, there are certain steps that need to be followed before we can create an object.



