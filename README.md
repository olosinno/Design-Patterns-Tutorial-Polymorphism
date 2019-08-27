# Design-Patterns-Tutorial-Polymorphism
A class is a blueprint. It has fields i.e. instance variables and has objects and methods created from it. It also defines all methods or functions for its objects. This superclass grant its object (subclass) access to its methods and variables, the subclass inheriting from its superclass. This is all about inheritance.

All fields in a superclass become private, only to be altered by public methods such as Getters and Setters within the superclass. A subclass that extends from the superclass is granted all of the methods and variables which will be predefined. Only those variables that change within the subclass should be altered.

The main method creates objects and helps them interact with one another. Any newly created objects should ever have their values referenced/set directly within the main method.

Encapsulation protects all data from alteration. By handling data manipulation in main method with our superclass' methods, it allows for checks and balances against accidental alteration of inherited/inheriting fields. Parameters are needed to define variables passed to a method and are isolated in scope so duplicate names will not interfere. Arguments are variables passed to methods when methods are used.

Abstraction allows us to hide our superclass data by making it private because again, we are using our methods to make changes to our private variables.

Instance fields/variables are declared inside of classes, but local variables are created in methods only for the method's use.

How do you decide if a class should extend another class? One way is to use the "IS A" principle. Is a dog an animal? Yes! Inheritance should be used when a subclass needs most methods in the superclass where almost every method in the superclass works with the subclass. Do not use inheritance just to reuse code because a class may not be fit to use a superclass' methods or variables. 
