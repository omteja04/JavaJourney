### Abstraction in Java

Abstraction is nothing but hiding some details and showing only the details that are necessary.
1. Abstract Class
   1. An abstract method is a method without body.
   2. Abstract methods can be created by adding a keyword `abstract` in front of the method.
   3. If a class contains at least one abstract method then you can have to make the class also as abstract class.
   4. You can't create instances for an abstract class.
   5. Abstract classes can also contain concrete methods (Methods with body).
   6. The major use is abstract classes can be used in inheritance. A class which inherits from an abstract class should provide the implementation of the abstract methods.
   7. If a child class fails to provide the implementation of the abstract class for all the abstract methods in parent class, the child class should also be made as abstract. 