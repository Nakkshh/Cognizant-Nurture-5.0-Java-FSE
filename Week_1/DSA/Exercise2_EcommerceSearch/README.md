# Exercise 2 - E-commerce Platform Search Function

## Objective

This project demonstrates the implementation of **Linear Search** and **Binary Search** algorithms for searching products in an e-commerce platform.

## Big O Notation

Big O notation measures the time complexity of an algorithm and describes how its execution time grows with input size.

### Linear Search

* Best Case: **O(1)**
* Average Case: **O(n)**
* Worst Case: **O(n)**

### Binary Search

* Best Case: **O(1)**
* Average Case: **O(log n)**
* Worst Case: **O(log n)**

## Comparison

| Algorithm     | Best | Average  | Worst    |
| ------------- | ---- | -------- | -------- |
| Linear Search | O(1) | O(n)     | O(n)     |
| Binary Search | O(1) | O(log n) | O(log n) |

## Which is Better?

Binary Search is more efficient for large datasets because it repeatedly divides the search space in half. However, it requires the data to be sorted beforehand. Linear Search is simpler and works on unsorted data but is slower for large collections.

## Files

* Product.java
* SearchOperations.java
* SearchTest.java
* README.md
* Output.txt

## Compile

```bash
javac *.java
```

## Run

```bash
java SearchTest
```

## Output

```text
Linear Search:
Product ID: 104, Name: Watch, Category: Accessories

Binary Search:
Product ID: 104, Name: Watch, Category: Accessories
```
