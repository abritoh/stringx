# StringX
[![Java](https://cdn.icon-icons.com/icons2/2415/PNG/64/java_original_wordmark_logo_icon_146459.png)]()

_**StringX, wraps the immutable Java String class providing semantic extension-methods through Interfaces.**_


### What's an extension method?
_An extension-method allows to add new functionality to existing classes/types, without modifying the original type's code. Extension methods add new behavior to types without extending through inheritance or without modifying the class itself.._


### Extension methods in other languages
In the dot-Net platform: _"An extension methods enable you to "add" methods to existing types without creating a new derived type, recompiling, or otherwise modifying the original type. Extension methods are static methods, but they're called as if they were instance methods on the extended type."_

```csharp
public static class SQLServerUtility {
  public static Tresult ValueIfExists<Tresult> (this IDataRecord record, string field_name)  {
  for (int index = 0; index < record.FieldCount; index++) {
	if (record.GetName(index).Equals(field_name,
	    StringComparison.InvariantCulture)) {
	   return record.Value<Tresult>(record.GetOrdinal(field_name));
       }
   }
    return default(Tresult);
  }
}
```

### Does Java allow the implementation of extension methods?
Short answer is yes, but not directly since extension methods are not part of the Java Core features. It is achieved in Java through reflection, and is implemented by creating Annotation classes that modify the actual Java source code before it is compiled. Libraries like Lombok or Manifold allows to implement extensions-method in Java by using this principle through Java-Annotations.

### Decorator ─ Structural Design Pattern
_"Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors"._

While we can think that Java-Annotations are a kind of Decorators, they are not exactly the same. In C# both concepts are structural features of the language, it means that in C# you can implement both: Decorators and Attributes (the equivalent of Java Annotation).


### Java Default methods in Interfaces

Since Java 8, Interfaces are allowed to provide default behavior to methods. 
_"A Default-method is a public non-abstract instance method, that is, a non-static method with a body, declared in an interface type."_

With this addition, Interfaces in Java are becoming more like C++ Abstract-Classes. 

By definition an abstract-class can't not be instantiated. In C++ a purely abstract-class is that whose methods are all virtual-functions, so none of them are implemented by the class; hence derived-classes are forced to provide the method's behavior by implementing them. 

The purely-abstract class defines a strict contract that derived classes must implement. And logically, is the origin of interfaces as they were defined prior to Java 8, and this is how the Interface concept is understood by C++ programmers.


### Extension-methods through Default methods in Java Interfaces
The idea presented in this article has been implemented by extending the Java String class through a wrapper named StringX, source-code has been uploaded to this GitHub repository.

The approach used in the StringX class ─that can be generalized─ is depicted below:

1─ To create a Wrapper-class for the type that we need attach new behavior to.

2─ The inner-object can be exposed through a shortcut method, for brevity.

2.1─ Or all methods of the inner-object can be exposed directly in the wrapper.

2.1.1─ In this last case no new implementation is needed just invocation of each inner-method.

3─ To create a common-interface for both the wrapper-class and the interfaces that will provide default-extension-methods.

3.1 This common-interface should be created selecting all the interfaces in the wrapped-type that represent the most-essential and significative behavior.

3.2─This common-interface must be implemented by the Wrapper.

3.3─ This common-interface must be extended (inherited) by the interfaces that will implement/add new behavior for the wrapped-type ─through default-extension-methods─.

4─ The common-interface is the glue/mechanism by which the default-extension-methods in the interfaces have access to the state of the internal-object defined inside the Wrapper class.



```java
public interface StringXExtensionPython extends StringXNativeInterfaces {
    default StringX swapcase() {
        String internal = this.toString();
        StringBuilder result = new StringBuilder("");
        if (!internal.isEmpty()) {
            char[] array = internal.toCharArray();
            for (int i = 0; i < array.length; i++) {
                char current = array[i];
                if (Character.isLowerCase(current)) {
                    result.append(Character.toUpperCase(current));
                } else if (Character.isUpperCase(current)) {
                    result.append(Character.toLowerCase(current));
                } else {
                    result.append(current);
                }
            }
        }
        return new StringX(result);
    }
```

