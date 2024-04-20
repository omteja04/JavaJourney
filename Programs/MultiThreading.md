<!--
  Author: omteja04
  Created on: 18-04-2024 20:51:37
  Description: MultiThreading
-->

**Threads**

Thread is nothing but a light weight process.
Thread can be executed parallel

**Example :-**
Amicable Numbers

| num1 = 10             | num1 = 7              |
| --------------------- | --------------------- |
| properFactorSum(num1) | properFactorSum(num2) |
| 1 2 5                 | 1                     |
| 8                     | 1                     |

How to create threads in Java ?

- By extending `Thread` class (belong to `java.lang` package `java.lang.Thread`)
- By implementing `Runnable` interface

Thread class contains the following important methods:

- `run()`: used to specify the job of the thread
- `start()`: used to start the thread

Thread life cycle :

1. `New State`: When you create an instance of thread or any subclass of thread class. Then the thread is in the new state.
2. `Runnable`: When `.start()` method is called then the thread is runnable state.
3. `Running`: When scheduler scheduler it for execution.
4. `Blocked State`: Thread is still alive but blocked for a moment.
5. `Terminated/Dead State`: Thread finished it's execution.
