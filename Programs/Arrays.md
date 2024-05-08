In java arrays are objects

`Object` is the mother of all classes
like `elder one` in Dr. Strange movie

![alt text](image.png)

- Arrays initialization in java can be done in 2 ways:
  - 1.java style
    - `Syntax:` datatype[] array_name = new datatype[size];
    - `Example:` int[] arr= new int[10];
  - 2.C style
    - `Syntax:` datatype array_name[]= new datatype[size];
    - `Example:` double arr[]= new double[10];

```java
//Initialization of array
int[] arr={10,20,30,40};
```

In java there is OutOfBound checking i.e., accessing the element at an index other the bounded size will give an error
This feature is not available in C/C++.
