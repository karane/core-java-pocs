## Overview
This project demonstrates different ways to handle concurrency in Java, including:
- `synchronized` methods and blocks
- `ReentrantLock`
- `ReadWriteLock`
- Atomic Variables

## Interesting Concept
### Reentrant Lock
A Reentrant Lock is a type of lock that allows the same thread to acquire the lock multiple 
times without causing a deadlock. This is useful in cases where a method with a lock calls another 
method that also tries to acquire the same lock.


## How to Run
1. Clone the repository.
2. Navigate to the project folder and run:
   ```sh
    mvn exec:java -Dexec.mainClass="org.karane.Main"
   ```