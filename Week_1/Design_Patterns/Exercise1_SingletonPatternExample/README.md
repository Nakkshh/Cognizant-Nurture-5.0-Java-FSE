# Singleton Pattern Example

## Objective

This project demonstrates the implementation of the **Singleton Design Pattern** in Java. The Singleton Pattern ensures that only one instance of a class is created throughout the application's lifecycle while providing a global access point to that instance.

## Project Structure

```
SingletonPatternExample/
│── Logger.java
│── SingletonTest.java
└── README.md
```

## Files Description

### Logger.java

* Implements the Singleton Design Pattern.
* Uses a private constructor to prevent external object creation.
* Provides a static `getInstance()` method to access the single instance.
* Includes a simple logging method.

### SingletonTest.java

* Tests the Singleton implementation.
* Obtains the Logger instance multiple times.
* Verifies that only one object is created.
* Prints the hash codes of both references to demonstrate that they point to the same object.

## How to Compile

```bash
javac Logger.java SingletonTest.java
```

## How to Run

```bash
java SingletonTest
```

## Expected Output

```
Logger instance created.
LOG: First log message.
LOG: Second log message.
Only one Logger instance exists.
Logger1 HashCode: <same value>
Logger2 HashCode: <same value>
```

## Concepts Used

* Singleton Design Pattern
* Private Constructor
* Static Instance Variable
* Static Factory Method
* Object Reuse

## Author

Nakshatra Jain
