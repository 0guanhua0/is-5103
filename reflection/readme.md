Reflection (LO1 - LO5) - 25 points

Completion requirements
Due: Monday, October 6, 2025, 2:59 AM

The objective of the reflection assignment is to demonstrate a comprehensive understanding of the course material and apply acquired knowledge to solve a real-world problem.

Task:
Reflect on the programs you have written and compiled in weeks 3 and 5 and answer the following questions.

Questions:

      - How easy or difficult was it to understand the programs that were presented?

     -  Were you able to find the relevant information that you needed to fully understand the programs and execute the tasks?

     - How did you obtain the knowledge that is necessary to write and compile the programs?

     - Do the programs effectively apply the concepts learned in the course?

     - Reflect on challenges faced and solutions implemented.

Lambda Expressions:

Another function in Java is the Lambda Expressions.   Provide a brief literature review related to the Lambda Expressions and discuss whether you could have applied this function to either program I or II or both?

Outcome:

Essay:

Once you have successfully answered the questions you are to write a 2 – 3-page paper.

APA- Essay Components:

     - Use the APA 7 style guidelines.

     - Main Body (2-3 pages).


# understand the programs

easy

# find the relevant information

search engine

# obtain the knowledge

try and run

# apply the concepts

programs effectively apply the concepts learned in the course

# challenge

- set up the environment
- code

# Lambda Expressions

lambda expression is a concise, anonymous function that can be used to implement a method defined by a functional interface

The traditional `for` loop in `Lab.java` is an example of external iteration, where the programmer explicitly controls the iteration logic. The Stream API with lambda expressions enables internal iteration, where the library controls the iteration, and the programmer simply provides the behavior to execute. The loop and calculation could be rewritten as follows:

```
import java.util.Arrays;

int[] lab = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};

Arrays.stream(lab).forEach(score -> System.out.println("Lab score: " + score));

double avg = Arrays.stream(lab).average().orElse(0.0);

System.out.println("lab average: " + avg);
```

https://en.wikipedia.org/wiki/Anonymous_function
