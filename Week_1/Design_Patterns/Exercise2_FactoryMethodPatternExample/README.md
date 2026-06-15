# Factory Method Pattern Example

## Objective

This project demonstrates the implementation of the **Factory Method Design Pattern** in Java. The Factory Method Pattern defines an interface for creating objects while allowing subclasses to decide which class to instantiate.

## Project Structure

```text
FactoryMethodPatternExample/
│── Document.java
│── WordDocument.java
│── PdfDocument.java
│── ExcelDocument.java
│── DocumentFactory.java
│── WordDocumentFactory.java
│── PdfDocumentFactory.java
│── ExcelDocumentFactory.java
│── FactoryMethodTest.java
└── README.md
```

## Files Description

* **Document.java** – Interface defining the common document behavior.
* **WordDocument.java** – Concrete implementation for Word documents.
* **PdfDocument.java** – Concrete implementation for PDF documents.
* **ExcelDocument.java** – Concrete implementation for Excel documents.
* **DocumentFactory.java** – Abstract factory containing the Factory Method.
* **WordDocumentFactory.java** – Creates WordDocument objects.
* **PdfDocumentFactory.java** – Creates PdfDocument objects.
* **ExcelDocumentFactory.java** – Creates ExcelDocument objects.
* **FactoryMethodTest.java** – Demonstrates creating different document types using their respective factories.

## How to Compile

```bash
javac *.java
```

## How to Run

```bash
java FactoryMethodTest
```

## Expected Output

```text
Opening Microsoft Word Document.
Opening PDF Document.
Opening Microsoft Excel Document.
```

## Concepts Used

* Factory Method Design Pattern
* Abstraction
* Inheritance
* Polymorphism
* Object Creation

## Author

Nakshatra Jain
