### Section 2

java
 - programming language
 - platform

java features
 - simple, object-oriented, familiar
 - robust and secure
 - platform neutral and portable
 - interpreted, threaded(high-performance) and dynamic(resolves at runtime)

java programming
 - strongly typed

java platform
 - java virtual machine (jvm)
   - platform specific binaries
   - virtual means abstract
   - interprets java bytecode
   - can run non java programs

 - java api
   - bundled libraries that we get to use

java runtime(jre) and compiler(jdk)

bytecode - intermediate language from source, machine code for the jvm.

main method - from door form the outside world to a java program

rules of the "main" method :
 - the modifier for main must be public and static, must be to the left of the modifier
 - must be void
 - main must be lower case, since java is case-sensitive
 - parameter must accept an array of strings


### Section 3

Primitives have state(no method) and are limited only to one state.

primitives
 - byte, short, int, long, float, double, boolean, char


Everything else in java is an object.

Instantiation

Object
 ReferenceType referenceVariable = new ObjectType();

Primitives
 Declare and assign value; Primitives don't have state.

Java Garbage Collection - Runs on its own

Stack and Heap
 - stack is a list of references within a piece of code ( also known as "scope")
 - heap is where all objects are stored in this space of memory
 - an object in the stack can reference objects on the heap

Objects
 - can contain behavior or other name is "Method"
 - invoking behaviors uses dot notation
 - fields or properties do not use parenthesis
 - methods must use parenthesis when called or invoked even if no arguments are passed or needed

"Member of a class"
 - is any piece of state or behavior that belongs to the class or object.
 - in general, a member refers to any field, method, or constructor in a class.
 - sometimes the term "class member" is used to specifically refer to static methods and static variables.

Initializing Data - Instantiation
 - using "new" keyword, with or without arguments, depends on the class's constructor
 - constructor is responsible for initialization, can only be called during instantiation
 - all objects have to have at least 1 constructor
 - multiple constructors are for flexibility

Creating Our Object Types
 - is called a class
 - an object defines what data objects of that type can store and what function they can perform
 - class is a template for object creation, where an object is an instance of a class
 - many objects can be generated form the class(when not a singleton)
 - each file may contain only on public top level class

A note on "void"

    A method that declares a return type of void cannot return any value.  
    So, for example, the following is illegal and would not compile:

    public void doSomething() {
        return "Hello!";
    }

    It is, however, legal (though uncommon) to just use the return statement.  

    public void doSomething() {
        return;
    }

    As mentioned, it's pretty uncommon (and useless) to see a return like that on it's own,
    though it can be used to end a method inside of a control structure.  
    You'll learn more about control structures in the Syntax section.
   
Building Constructors

 - "new" under the hood, variable is on the stack and allocates space on the heap
 - default value is NULL (nothingness)
 - variables are explicitly initialized being used
 
Default values
 
 - any object             - null
 - boolean                - false
 - byte, short, int, long - 0
 - float, double          - 0 
 - char                   - '\u0000' NUL/blank character
 
Default Constructor
 - java provides a "no-arg" constructor as a "default" constructor when defining a class 
    without explicitly defining any.
 - if you define a constructor other than no-arg, 
    you need to add explicitly define no-arg constructor if you need to or if it makes sense
    
"no-arg" vs "default" constructor

 - no-arg, constructor that takes no arguments
 - default, is a no-arg constructor created by the compiler if no constructor has been defined
 
Initialization Block
 - initialization block just a curly braces "{}" 
     used as common initialization logic when you have a bunch of constructors 
     
Precedence
 - inline (init of instance variable) and initialization block depends on order they are listed
 - lastly, constructor initialization
  
### Section 4 
  
Static Variables and Methods
 - using "static" keyword
 - also known as class member variable/method
 - tied to a class not to an instance object
 - shared across all objects
  
Rules for static methods
 - should not have access to instance variables

What's the point of static methods
 - used to access class variable data
 - provide functionality without the need for an object/instance
 
Static Initialization Block
 - just add "static" keyword to an initialization block
 - executed everytime an object is initialized
 
"this" keyword
 - goes directly into the heap bypassing the stack frames
 
Constructor Chaining
 - the constructor call from another constructor must be at the first line
 - can only be called in a constructor 
 - cannot be called inside a method
 
Scope
 - controlling access and availability
 
Java Garbage Collection
 - java manages memory leak for you by garbage collector 
 
### Section 5
 
Package
 - way of organizing classes ( fully qualified name ) more specific as a folder/directory
 - avoid naming conflicts
 - help control access to the code
 - use import statement using "import" keyword
 - cannot do partial wildcards similar to regex "package.Cla*"
 - does not allow "java.*" importing all java api
 - default access to the same or current package
 - default access to java.lang package
 
Classpath
 - differ from os to os
 - javac -classpath project-root-directory; Someclass.java

JarFile .jar
 - bundling a project with bunch of files
 - security signing
 - easier versioning for every release
 - portable
 - include jars using (*)
 
### Section 6

Coding Conventions and Primitives

Coding Standards
 - java is a free-form language

Curly braces
```java
 public void foo() {
    // stuff here
 }
```
 vs
```java
 public void foo()
 {
    // stuff here
 }
``` 
Class names
 - UpperCamelCasing

Functions/Methods/Properties
 - lowerCamelCasing

Package name
 - all.lower.case;
 
Valid identifiers
 - contains numbers, letters, underscores, and dollar sign
 - do not start with a number
 - java keywords cannot be used as identifiers

Comments
 
```java

// line comment
/*

 block comment

 */

/*
 * 
 * block comment
 * 
 */

```
 - nest block comment is illegal
 
Javadoc comment

 - used for api documentation
```java

package com.japzio.vehicles;

/**
 * 
 * Creates a car that prints its description
 * @author jasper
 * @since 1.8
 * 
 */


public class Car{
  
  // car stuff here
  
}

```

Primitive Types

Categories
 - Integers  : byte, short, int and long ( everything is singed )
 - Floating  : float and double
 - Boolean   : boolean
 - Character : char

Boolean
 - is just a bit
 - cannot be converted to another type

Character
 - is unicode text in java
 - character literals are simple type
 - escape characters
 - hexadecimal notation can be used if not available on the keyboard

Integers
 - are differentiated by their potential size
 - byte(8bits), short(16bits), int(32bits), long(64bits) 

Primitive Literals
 - any number without literal is an int by default
 - if long is needed, add l or L
 - if floating point is double by default, if adding d or D is valid but redundant
 - if float is needed, add f or F
 - any int that start with 0 is an octal
 - any int that start with 0x is an hex

Underscore Literal
 - java 7, underscore separator for value ( 23451 = 23_451 )
 - cannot be used as first and final character ( _23423 or 23423_ )
 - illegal, 151423_.34
 
Conversion or Casting
 - widening or narrowing(use casting)
 
Big Numbers
 - BigInteger and BigDecimal from java.math package
 - solving the limitations of primitives
 - used for engineering or for number crunching algorithms with "arbitrary" precision
 
### Section 7

Java Syntax

if / if-else / else statement
 - if no curly braces, on the first statement is associated with it

switch statement
 - case and default
 
operators
 - with order precedence
 - bitwise and short-circuit
 - ">>>", "<<<" unsigned shift
 - ">>" , "<<"  signed shift

loop
 - keeps on iterating until a condition has been met
 - while, do-while, for

break, continue and label
 - break - breaking out of the current loop
 - continue - continue the loop without executing statements below it
 - label, used as loop reference to nested loop to break or to continue

enumeration ( enum )
 - solving case sensitivity values

### Section 8

Strings 
 - Strings are objects but they are special kind of Objects
 - String pool based on flyweight design pattern(problems solved by string immutability)
 
Immutable
 - Strings are immutable in java
 - Overriding values in strings can hurt performance due to excessive garbage during value overrides
 
Performance Notes
 - use StringBuffer and StringBuilder classes for mutability use cases

StringBuffer - thread-safe(slower used for multi-threading)
StringBuilder - not thread-safe, used in concurrency

Pass By Value
 - all variables in java are pass by value
 - primitive pass by value means a copy of the primitive
 - object pass by value means a copy of the reference is made

### Section 9 

Encapsulation
 - technique of bundling data
 - Accessors/Mutators or Getters/Setters
 
Data-Hiding 
 - through access modifiers
 - private, public, protected and default(no modifier)
 
Accessors/Mutators or Getters/Setters
 - interface of the class

Starting Point
 - create all private and closed-off class eventual exposure

Access Modifiers
 - public - access is not limited
 - private - access is allowed only by the declaring class
 - protected - allowed by the declaring class, in the same package and any descendant(extending class)
 - default - allowed by the declaring class, in the same package
 
### Section 10 

Inheritance
 - single inheritance - can extend to only one class
 - DRY don't repeat yourself
 - Composition with "has a" rule
 - "is a rule"
 - super class , sub class
 - generic class, specific class
 - parent class, child class
 
Multiple class Inheritance
 - Person -> Employee -> Instructor
 
Chaining Constructors
 - be sure have superclass fields with protected modifier but it would encapsulation
 - the second option is to used interface to the class methods or the getters and setters
 - using "super" keyword
 
Super and The First Statement Rule
 - super should be the first statement when chaining constructors
 - super with a dot operator super.doSomething() is not bound by first statement rule
 - the grandchild cannot call the grandparent or any of the ancestors super
 
Overloading Methods
 - signature must be unique
 - signature include - name of the method and the number and type and including the order of the parameters
 - identifier name and the return type is ignored, therefore not part of the signature

Overriding Methods
 - must have the same signature as the method being overridden 
 - and the subtype of the overridden return type(covariant return)
 - cannot be less accessible then the method being overridden, more accessible is fine
 - reimplementation of a superclass method with the same signature using @Override annotation
 - look for rules of exception handling
 - cant override 'static' or 'private' methods
 - overridden methods are resolved at runtime

Static and Private methods
 - resolved at compile time, in contrast to overridden methods which are resolved at runtime

Covariant Returns
 - Parent type and the Sub type returns

The "final" modifier
 - mean unable to change or makes a variable "constant"
 - if on method, cannot be overridden
 - if on class, cannot be inherited, should not have any descendants
 - constants are usually static
 - by convention, identifier is upper case and underscore ( UPPER_CASE )
 - final variables must be set before being used
 - trying to set final outside of initialization results in compile error
 - String class is final
 - enums are implicit static and final

### Section 11

Polymorphism and its benefits
 - By the rules of polymorphism, A reference variable that is an interface type 
      may hold a reference of any class that implements that type.
 - an object can substituted with another object with a same type or sub-type
 - the object type is a descendant, is legal
 - makes an application future-proof
 - allows covariant returns
 - poly(many)morph(forms)
 - substitutability
 - flexibility and separation of concerns
 - dynamic method dispatching
 - jvm traverses the inheritance tree, but mitigated by "final" method keyword to prevent stackoverflow error
 - during the declaration, only the reference object variables can be looked up, not the object type

Object Type Casting
 - in primitive data types, it is a force truncation to smaller data types
 - with objects, casting is used to return more specific types

"instanceof" keyword
 - type safe casting, preventing ClassCastException
 
the Object class
 - commonly overridden methods are toString() and equals() both from java.lang.Object class
 - everything in java (except primitives) is an "Object", means eventually extends java.lang.Object(implicitly)
 
toString() method
 - by default, turns an object into a String representing its type and hashcode (often a reference to the object's location on the heap)
 - format would be MyObject@412312
 
equals() method (and hashCode())
 - difficult to override
 - if you choose to override, it is also necessary to override the hashCode() method
 
 
### Section 12

Abstract Classes and Interfaces

Abstraction
 - to simplify or to generalize functionality without providing implementation details
 - doesnt have any implementation
 
```java
public abstract class Shape {
  public abstract double area();
}
```
 - abstract sub types must implement all abstract methods of the super class unless the sub class is also abstract
 - can also contain concrete methods
 - abstract classes cannot be instantiated
 - main purpose is for polymorphism
 - public, static, final modifiers make no sense if used on abstract classes
 
Interfaces
 - use "interface" keyword, and the implementing class will use "implements"
 - are pseudo classes, which are defined in their own .java file extension
 - abstract, default(implicit abstract) and static
 - implemented by classes
 - a class can implement any number of classes
 - is a contract that a class signs, brings an obligation to implement
 - can extend another interface
 - pseudo means of multiple inheritance
 - interfaces are name by adjectives, or include the the word listener or interface
    Runnable, Serializable, Clonable, Drawable, ActionListener
 - all interface methods are public

default methods
 - using default keyword
 - backwards compatibility, only appear on interfaces, not necessary on concrete classes
 
static methods
 - concrete methods don't inherit static methods
 
### Section 13

Lambda Expressions and Static Imports

Marker Interfaces
 - and interface without any methods is called "Marker" interface
 
```java
package java.io;

public interface Serializable {
}
```
 - common in java API
 - Serializable means convert to ByteArray to be sent to a network

Functional Interfaces
 - an interface with only on abstract method is a "Functional" interface
 
```java
package java.io;

public interface Payable {
  double raiseSalary(double percentage);
}
```
 - tied directly to lambda expressions in Java SE 8
 
Lambda Expression Systax
 - (double percentage) -> { return salary + ( percentage * salary); }
   method params   arrow token  method body

Predicate
 - functional interface to handle a very common scenario, "test" method is invoked with a parameter,
   resulting in a boolean outcome
 - included in Java
 - Predicate<T> where T can be any type needed in a test
 - it's single abstract method is: bolean test(T t) which uses the same parameter type declared in the
   Predicate reference
   
```java
public interface Predicate {
  boolean test(T t);
}
``` 

Static Imports
 - allows constants and static methods to be imported, from either a class or an interface, without importing the entire class
 - keyword "static" after import, can also be a wildcard(*) import
 - similar to regular imports, wildcards in static imports are not recursive 
```java

import static org.japzio.automobile.SafeDriver.printMaxSpeed;

public class Test {
  public static void main(String args[]) {
    
  }
}
```

### Section 14

Dates and Time
 - Date and Time classes are immutable

Study More with
 - LocalDate 
 - LocalDateTime 
 - LocalTime 
 - Period
 - and DateFormatter, TimeFormatter, DateTimeFormatter

### Section 15

Arrays 
 - basic form of collection, a bunch of related things and putting it all together
 - homogeneous collection, with the same type, indexed with integers
 - contains a piece of state, read-only attribute using ".lenth()" property
 - array cannot be resized, but can be copied to a different array with a different size using system helper class
 - System.arraycopy(params)
 - not limited to Primitives but can hold Object types with default null values
 
```java
class ArraySampleOne {
  int[] intArrayOne;
  int intArrayTwo[];
}
```
 - definition only matters when you are declaring more than one variable
 
```java
class ArraySampleTwo {
  char[] charArrayOne, charArrayTwo;
  char charArrayThree[], charOne;
}
```

```java
class ArrayDefinition {
  public static void main(String args[]) {
      int[] intArrayOne = new int[10]; // all values are set to 0
      intArrayOne[0] = 23;
      intArrayOne[1] = 1;
      
      // subscripting above, assigning value via index
      
      int[] intArrayTwo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      
      // Illegal, must be on the same statement or line
      
      int[] intArrayThree;
      intArrayThree = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
  }
}
```

 - main(String args[]) method, any string(s) that has been passed from the command line
 
Iterating an Array

```java
public class IterateArray {
  public static void main(String args[]) {
    
    int[] arrayOne = { new MyObject("one", "two"), new MyObject("three", "four") };
    
    for ( i = 0; i < arrayOne.length; i++ ) {
      System.out.println(arrayOne[i].toString());
    }
    // for-each
    
    for ( MyObject myObject : arrayOne ) {
      System.out.println(myObject.toString());
    }
    
  }
}

class MyObject {
  
  private String fieldOne;
  private String fieldTwo;
  
  public MyObject() {}
  
  public MyObject(String fieldOne, String fieldTwo) {
    this.fieldOne = fieldOne;
    this.fieldTwo = fieldTwo;
  }
  public String toString() {
    return this.fieldOne + " " + fieldTwo;
  }
  
} 

```

Multi Dimensional Arrays
 - multiple indices
```java
int[][] credentials = new int[3][2]; // legal
  int[][] credentials2 = new int[3]; /* Illegal. Missing the 2nd dimension */
```

  - Just like regular arrays, the square brackets can go to the right of the type, or the right of the identifier:
```java
int[][] credentials = new int[3][2];
//or 

int credentials[][] = new int[3][2]; 
```
  - They can be split up as well (though this is uncommon)
```java
int[] moreStuff[][] = new int[3][3][2];
// or
int[][] moreStuff[] = new int[3][3][2];
```

Sorting and Searching Arrays
 - provided by java api
 - sorting, searching, filling and comparing functionality
 - using static Arrays.sort() method.
 - if no comparison instructions are passed to sort(via a "Comparator" object), primitives are sorted by their 
    c
 - Arrays.binarySearch(), arrays must be sorted for binary search to work
 - Arrays.fill(), fills all elements of an array with one value
 
Common Array Mistakes
 - forgetting about arrays are zero based ( zero indexed ) instead of one based, skipping the first element
 - forgetting the size of the array, causing java.lang.ArrayIndexOutOfBoundsException
 - declaring size in the wrong place. "int[10] identifier" instead of in initilization
 
Varargs
 - variable number of arguments using ellipsis (...)
```java
class VarArgsExample {
    public void acceptVariableNumOfInts(int[] anyInts) {
      for ( int i : myInts ) {
        System.out.print(i);
      }
    }
    // varargs syntax
    public void acceptVariableNumOfInts(int... anyInts) {
      for ( int i : myInts ) {
        System.out.print(i);
      }
    }
    
     // if mixed with other non array, the varargs should be on the last
    
    public void acceptWithVarargs(String message, char cmd, int... anyInts) {
      for ( int i : myInts ) {
        System.out.print(i);
      }
    }
    
    // alternate syntax to the common main mathod
    public static void main(String... args) {
      
    }
}
```

###Section 16 

Java Collections Framework
 - when arrays are not enough
 - the collections framework offers an alternative mean of grouping objects
 - is a set or prebuilt data structure components that are part of java.util package
 - have their strengths and weaknesses
 - dynamically sized
 - Stores only Objects and also Primitives with autoboxing
 - can be heterogeneous
 - use methods to access elements
 - no special initialization syntax

Types of Collections
 - Collections
 - Maps
 
ArrayList
 - represent dynamically sizable array

Iterator
 - traverses a collection using Iterator object using boolean Iterator.hasNext()

ListIterator
 - only availabe for lists
 
List
 - extends Collection
 - maintains the order of the elements
 - allows duplication
 - can be manually sorted
 - implementations : ArrayList and LinkedList

ArrayList
 - implements List
 - array initialization syntax with a collection
 - index can be used to get(), set() and remove()
 - set()(replace)
 - fast for random access via index
 - slow for add or remove
 
LinkedList
 - implements List
 - slow for random access
 - fast for add and remove
 
Set
 - no duplicates allowed, reason to override equals() method mandatory to override hashCode()
 - order is not strictly maintained
 - sets does not have or do not use index
 - implementations: HashSet and TreeSet

HashSet
 - backed by a hash table (actually a HashMap instance)
 - It makes no guarantees as to the iteration order of the set
 - it does not guarantee that the order will remain constant over time 
 - this class permits the null element
  
TreeSet
 - ordered set using Unicode characters ( numbers, capital letters, lowercase letters )
 - relies on method compareTo() to sort components automatically
 - otherwise, uses Comparator passed in to the constructor during initialization
 - uses a tree organization to organize set but you have no control over the links 
    between nodes(parent and children)
 - even though ordered, items are not indexed(see Set)

Queue
 - with head and tail
 - implementations: ArrayBlockingQueue and PriorityQueue
 - with exception-throwing and non-exception-throwing methods
 
ArrayBlockingQueue
 - first in first out (FIFO)
 - head is the oldest, tails is the newest
 - removes and element on the head and adding in the tail
 - holds a fix number of elements, capacity cannot be changed

PriorityQueue
 - allow first-class or premium queue to skip to the head of the line
 - anything with higher "order" is moved to the head
 - elements are ordered by their natural ordering (Comparable/Comparator)
 - an unbounded priority queue based on a priority heap, opposite to ArrayBlockingQueue
 - as elements added, it automatically grows
 - non thread-safe, use PriorityBlockingQueue
 
Deque
 - A linear collection that supports element insertion and removal at both ends.
 - The name deque is short for "double ended queue" and is usually pronounced "deck".
 - unbounded
 - implementations: ArrayDeque

ArrayDeque
 - null element is not allowed
 - not thread-safe

Map
 - part of the Java Collections Framework but not associated with Collections interface
 - key-value pairs
 - operations to elements in a map use key
 - does not allow duplicate keys
 - AbstractMap
  * HashMap(most popular)
  * TreeMap
 - Dictionary
  * Hashtable

HashMap
 - ordered via hashCode() method




 
 

 
 
 

 

 

 