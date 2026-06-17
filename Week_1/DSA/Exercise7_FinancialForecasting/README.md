# Exercise 7 - Financial Forecasting

## Objective

This project demonstrates the use of **recursion** to predict future financial values based on a fixed annual growth rate.

## What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a problem by breaking it into smaller subproblems. Every recursive method must have a **base case** to stop further recursive calls.

## Algorithm

The future value is calculated using the formula:

```
Future Value = Current Value × (1 + Growth Rate)^Years
```

The recursive solution repeatedly multiplies the current value by `(1 + growthRate)` until the number of years becomes zero.

## Time Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

where `n` is the number of years.

## Optimization

The recursive algorithm is simple and easy to understand, but it uses the call stack for each recursive call. For very large values of `n`, this may lead to unnecessary memory usage.

Possible optimizations include:

* Using an iterative approach to eliminate recursive calls.
* Using exponentiation (`Math.pow`) for direct computation.
* Applying memoization when recursive subproblems overlap.

## Files

* FinancialForecast.java
* ForecastTest.java
* README.md
* Output.txt

## Compile

```bash
javac *.java
```

## Run

```bash
java ForecastTest
```

## Expected Output

```text
Current Value : 10000.00
Growth Rate   : 10%
Years         : 5
Future Value  : 16105.10
```
