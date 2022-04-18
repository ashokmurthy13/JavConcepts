# var

### Local Variable Type Inference

* Local Variable :: local variables only
* Type Inference :: the Java compiler infers the type for you based on the value initialized, instead of you declaring the type explicitly

### Use Cases

* Local Variables only
  * variables within a method
  * resource variables for try-resources
  ```
    try(var reader = new FileReader(...)) {
        ...
    }
  ```
  * loop variables in for-each loop
  ```
    for(var string : stringList) {
       ...
    }
  ```


### Not be Used

* var cannot be used for
  * method parameters
  * method return types
  * fields

* why not?
  * these types are part of a Class's API - best to be explicit
  * they are written into the Class file
  * they affect the Binary Compatibility
  * too easy to introduce errors by inadvertently changing an inferred type

### How does var infer the type?

* var must be used to declare a variable with an initializer of a known type
* The type of the initializer is used to infer the type of the variable
```
    var customer = new Customer();  // Customer
    var name = "Ashok";             // String
    var numbers = List.of(1,2,3);   // List<Integer>
```
* The below doesn't work
```
    var cusomter;                       // ERROR
    var customer = null;                // ERROR
    var func = (int a, int b) -> a + b; // ERROR
```

### Can a Var variable can be Re-assigned?

* var variable can be re-assigned to values of a compatible type
```
    var name = "Ashok";                 // String
    name = "Murthy";                    // ok
    name = List.of("Ashok","Murthy");   // ERROR

    var nameList = List.of("Ashok", "Murthy");  // List<String>
    nameList = new ArrayList<>();               // ok
```
* If you want a variable that cannot be re-assigned
```
    final var name = "Ashok Murthy";
```


### Principles and Guidelines

https://openjdk.java.net/projects/amber/guides/lvti-style-guide

### Resources

https://www.youtube.com/watch?v=786iemaCJHU
