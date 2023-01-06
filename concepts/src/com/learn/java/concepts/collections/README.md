# Collection

## List

### ArrayList
### LinkedList
### Vector
### Stack
### CopyOnWriteArrayList (java.util.concurrent.*)

## Set

### HashSet
### LinkedHashSet
### TreeSet
### CopyOnWriteArraySet (java.util.concurrent.*)

## Map

### HashMap
### LinkedHashMap
### TreeMap
### ConcurrentHashMap (java.util.concurrent.*)


### List vs Set

1. List is an **Ordered** collection
2. List **allows Duplicate** elements
3. List works based on Index
4. List can be used to access element frequently (very fast, since it uses Index)
5. Set doesn't allow duplicate elements
6. Set works based on Hashing
7. Use Set when you need to use a collection of different elements

### ArrayList vs LinkedList


## Queue

Queue is an Interface. Its follow FIFO [First In First Out] order.

The most common implementation classes are **PriorityQueue** and **LinkedList** both of the classes are **not thread-safe.** **PriorityBlockingQueue** is a **thread-safe** class.

**Operations on Queue**

| Operations         | Description                               | Exception                                |
|--------------------|-------------------------------------------|------------------------------------------|
| boolean add(E e)   | add element to the Back/Rear of the Queue | IllegalStateException - if queue is full |
| boolean offer(E e) |                                           |                                          |
| E remove()         |                                           |                                          |
| E poll()           |                                           |                                          |
| E element()        |                                           |                                          |
| E peek()           |                                           |                                          |


### BlockingQueue