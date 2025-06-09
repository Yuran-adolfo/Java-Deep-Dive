What is a Generic?

Well, the idea of Generics is to allow a type like(Integer, String etc...) to be a parameter to methods,
classes, and interfaces.
Generics allow us to create classes,methods, and interfaces where  the type of the data is specified as a
parameter. If we use Generics, we don't have to write multiple version of the code for different data types.

Why to use it?
There are several reasons but, I'm only going to show the most important for me.

1->Type safety-> Generics ensures that only the specified type is used, catching type errors at compile time
rather than runtime. For example, a List<String> can only store Strings, preventing accidental insertion of 
others types.
2->Eliminates Casting-> Without Generics , you need to  cast objects  when retrieving them from collections,
which is error-prone. Generics remove this need, making code cleaner and safer.

3->Code Reusability->Generics allow you to write classes, methods, or interfaces that work with any data type,
reducing code duplication. A single generic class (e.g., Box<T>) can handle Strings, Integers, or custom objects.

Types Generics
1->Generic Method: A generic Java method takes a parameter and returns some value after performing a task. 
It is exactly like a normal function, however, a generic method has type parameters that are cited by 
an actual type. This allows the generic method to be used in a more general way.

2->Generic class: A generic class is a class that can operate on objects of different types using a type parameter. 
Like C++, we use <> to specify parameter types in generic class creation. 

3->Generic interface: 
allowing it to work with different data types while maintaining type safety. Like generic classes, generic interfaces
enable reusable, type-safe code, reducing the need for casting and minimizing runtime errors.