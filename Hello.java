//////Java Collection :
////Core concepts and framework basics
////Java Collections Framework: Understand what the framework is and its key benefits, such as a consistent API, reduced development effort, and increased speed and quality.
////Collection vs. Collections: Know the crucial difference between the Collection interface (the root of the hierarchy) and the Collections utility class, which provides static methods for operating on collections.
////Collection hierarchy: Be able to explain the structure of the Collection framework, including the main interfaces (List, Set, Queue, and Map) and their relationship to implementing classes.
////Array vs. Collection: Differentiate between the two, noting that arrays have a fixed size and can store primitives, while collections are dynamic and only store objects.
//
////Key implementation classes
////ArrayList vs. LinkedList: Compare these two List implementations:
////Data structure: ArrayList uses a dynamic array; LinkedList uses a doubly-linked list.
////Performance: ArrayList offers faster random access (reading), while LinkedList provides faster insertion and deletion.
////Use case: Choose ArrayList for read-heavy operations and LinkedList for applications with frequent data manipulation.
//
//Iterators and traversal
//Iterator vs. ListIterator: Explain that Iterator can traverse any Collection in a forward direction and supports element removal, while ListIterator is only for Lists and can traverse bidirectionally, as well as add or replace elements.
//Iterator vs. Enumeration: Differentiate between the modern Iterator and the legacy Enumeration. The key difference is that Iterator has a remove() method, and it is "fail-fast".
//Fail-fast vs. fail-safe iterators: Understand this crucial concurrency concept. Fail-fast iterators (like those in ArrayList) throw a ConcurrentModificationException if the collection is structurally modified during iteration. Fail-safe iterators (like those in CopyOnWriteArrayList) operate on a copy of the collection, so they won't throw this exception.
//ConcurrentModificationException: Know why and when this exception occurs, and how to avoid it (e.g., by using an iterator's remove() method or a concurrent collection).