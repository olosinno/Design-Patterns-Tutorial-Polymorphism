# Design-Patterns-Tutorial-Polymorphism
Polymorphism allows programmers to write methods that don't need to change if new subclasses are created. Example: a subclass Dog can add a new method such as dig without affecting superclass Animal in any way. Also, subclasses may be referred to by their superclass type. You can then create subclasses from subclasses. You cannot however access methods this way if they're only in the subclass.

Abstract classes grant all of the power of polymorphism without any of the work. There are no abstract fields or variables, all methods inside of an abstract class however do not need to be abstract - they can be static. You cannot create objects from an abstract class, but subclasses can still extend it which is its primary purpose.

Interface is a class with only abstract methods. You can add as many interfaces to a class using implements as you want, but you can only use public static and final fields if you choose to use them at all. Interfaces are flexible because classes from different inheritance trees can use a common interface.
