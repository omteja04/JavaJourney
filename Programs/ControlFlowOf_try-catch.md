# Control Flow in try-catch
```java
try{
    statement1;
    statement2;
    statement3;
}
catch(X e){
    statement4;
}
statement5;
```
`X : any Exception`


**Possible Cases:**

1. When there is no exception raised in try block statements {1,2,3,5} gets executed.
2. If there is an exception at statement 1 and catch block is having corresponding handler - 4 & 5 gets executed.
3. If there is an exception at statement 1 and catch block is not having corresponding handler - program crashes after statement 1.

