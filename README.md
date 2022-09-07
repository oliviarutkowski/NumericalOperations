# NumericalOperations

## Introduction
In this lab you will apply numerical operations to perform calculations and print the results to the console

## Code Challenge 1

- [ ] Create a new java class called NumericalOperations.java.  

- [ ] In the lab guide you predicted the outcome of several numerical operations.  Here they are again below. 

- [ ] Calculate the result of each problem in the NumericalOperations class. How does what you predicted compare to the actual result?

```
“Problem 1: 79 + 3 * (4 + 82 – 68) – 7 + 19 = ”
“Problem 2: (179 + 21 + 10)/7 + 181 = ”
“Problem 3: 10389 * 56 * 11 + 2246 = “
```

```
int dividend = 12, divisor = 4, quotient = 0, remainder = 0;
int divident2 = 13, divisor2 = 3, quotient2 = 0, remainder2 = 0;
quotient = dividend / divisor;
remainder = dividend % divisor;
quotient2 = dividend2 / divisor2;
remainder2 = dividend2 % divisor2;
System.out.println(quotient);
System.out.println(remainder);
System.out.println(quotient2);
System.out.println(remainder2);
```

```
double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;
57.2 * (i1 / i2) + 1
57.2 * ((double)i1 / i2) + 1
15 – i1 * (d1 * 3) + 4 
15 – i1 * ((int)d1 * 3) + 4
```

## Code Challenge 2

- [ ] In the ModulusCalc class, write an algorithm that prints the modulus of any positive integer, without using the modulus operator.  Below is sample assignments for the integer and modulus and the corresponding output, 

|  number | modulus  | result |
|---|---|---|
| 1234  | 10  | 4 |
| 101010  | 2  | 0 |
| -2312  | 33  | 2 |

## Code Challenge 3

- [ ] Create a new java class called NumReverse.java
 
- [ ] Implement the number reversal code you wrote in the group portion of this lab.  Your code should work for any 4 digit integer.  When your code is ran the original and the reversed number should print to the console.  Consider the examples below, 

|  number | result  |
|---|---|
| 1234  | 1234 --> 4321  |
| 6789  | 6789 --> 9876  |
| 1080  | 1080 --> 0801  |


