# Program 1 Assignment (LO1) (LO2) (LO3) - 25 points

[openjdk](https://openjdk.org/)

# Task

Write and compile a program that displays:

Your name

Date enrolled at Trine University

Your major

At least one completed class

At least one class you are currently enrolled in

```
public class Info {
    public static void main(String[] args) {
        System.out.println("guanhua");
        System.out.println("2024-09");
        System.out.println("msis");
        System.out.println("is-5213");
        System.out.println("is-5103");
    }
}
```

```
guanhua@arch ~/is-5103/program-assignment-1 (git)-[main] % javac Info.java
guanhua@arch ~/is-5103/program-assignment-1 (git)-[main] % java Info
guanhua
2024-09
msis
is-5213
is-5103
```

# Essay Task: Training Guide

## Explain the purpose and importance of program compilation
- Translation: It converts high-level programming languages (like Java) into low-level machine code that a computer's processor can execute.
- Error Checking: The compilation process checks for syntax errors and other issues in the source code, helping developers identify and fix problems before execution.
- Optimization: Compilers often optimize the code to improve performance, making the final executable more efficient.
- Portability: Compiled code can be run on different platforms, provided the appropriate runtime environment is available.

## Introduce Java as a compiled language
Java is compiled language, meaning that Java source code (.java files) is compiled into bytecode (.class files) by the Java Compiler (javac). This bytecode can then be executed on any platform with Java Virtual Machine (JVM).

## Provide a step-by-step explanation of the compilation process
- environment setup: install jdk
- source code: Write your Java program in .java file
- compile: Use javac to compile the .java file into .class file
- execute: Use java command to run the compiled .class file
