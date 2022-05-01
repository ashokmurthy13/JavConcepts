
# Generics

### Why we need Generics?

* Errors can be detectable at compile time and not at run-time
* We prefer compile-time errors rather than run-time errors
```
  * Compile Time Errors
    * Easy to detect as the application will not compile
    * Compiler error messages help to figure out what the problem is
    * Easy to fix
  * Run Time Errors
    * More problematic
    * Difficult to point the issue
```
* Type casting: The problem is that the JVM must test the type casting at run-time. 
* Generics avoid Type casting and provides Compile time Type Safety.
* Avoid code-duplication

### What is Type Erasure?

* Generic Type information is not available to the JVM at runtime(you cannot get the Type at runtime), only compile time.

Why : This is implementation choice and the reason is simple - to preserve Backward Compatibility, since Generics is available from Java 5.

How : The compiler will do the following changes

* Replace Generic Types with Objects
* Replace Bounded Types with the first bound class
* Insert equivalent of casts when retrieving generic objects 
