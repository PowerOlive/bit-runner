# The Most Important Classes

## Object

> **root of the class hierarchy**

------

**↪  java.lang.Object#getClass()**

> public final native Class<?> getClass();

✓ Demo

```java
Object obj = new Object();
Class<? extends Object> c = obj.getClass();
System.out.println(c);
```

♯ Output

```text
class java.lang.Object
```

------

**↪  java.lang.Object#hashCode()**

> public native int hashCode();

✓ Demo

```java
Object obj = new Object();
int hash = obj.hashCode();
System.out.println(hash);
```

♯ Output

```text
685325104
```

------

**↪  java.lang.Object.equals(Object)**

> public boolean equals(Object obj);

✓ Demo

```java
Object x = new Object();
// reflexive
System.out.println(x.equals(x));
```

♯ Output

```text
true
```

✓ Demo

```java
Object x = new Object();
Object y = new Object();

// symmetric
System.out.println(x.equals(y));
System.out.println(y.equals(x));
```

♯ Output

```text
false
false
```

✓ Demo

```java
Object x = new Object();
Object y = x;

// symmetric
System.out.println(x.equals(y));
System.out.println(y.equals(x));
```

♯ Output

```text
true
true
```

✓ Demo

```java
Object x = new Object();
Object y = x;
Object z = y;

// transitive
System.out.println(x.equals(y));
System.out.println(y.equals(z));
System.out.println(x.equals(z));
```

♯ Output

```text
true
true
true
```

✓ Demo

```java
Object x = new Object();
// null reference
System.out.println(x.equals(null));
```

♯ Output

```text
false
```

------

**↪  java.lang.Object#toString()**

> public String toString();

✓ Demo

```java
Object obj = new Object();
System.out.println(obj.toString());
System.out.println(obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode()));
```

♯ Output

```text
java.lang.Object@28d93b30
java.lang.Object@28d93b30
```

------

## Class

> **instances of which represent classes at run time**

------

**↪  java.lang.Class#toString()**

> public String toString();

✓ Demo

```java
// Primitive
System.out.println(int.class.toString());
System.out.println(double.class.toString());
System.out.println(void.class.toString());
// Class
System.out.println(java.lang.Object.class.toString());
System.out.println(java.lang.Class.class.toString());
System.out.println(java.util.Collection.class.toString());
System.out.println(java.util.HashMap.class.toString());
// Interface
System.out.println(java.lang.Runnable.class.toString());
// Enum
System.out.println(java.lang.Thread.State.class.toString());
// Exception
System.out.println(java.lang.NullPointerException.class.toString());
// Error
System.out.println(java.lang.ClassFormatError.class.toString());
// Annonation
System.out.println(java.lang.Override.class.toString());
```

♯ Output

```text
int
double
void
class java.lang.Object
class java.lang.Class
interface java.util.Collection
class java.util.HashMap
interface java.lang.Runnable
class java.lang.Thread$State
class java.lang.NullPointerException
class java.lang.ClassFormatError
interface java.lang.Override
```

------

**↪  java.lang.Class#toGenericString()**

> public String toGenericString();

✓ Demo

```java
// Primitive
System.out.println(int.class.toGenericString());
System.out.println(double.class.toGenericString());
System.out.println(void.class.toGenericString());
// Class
System.out.println(java.lang.Object.class.toGenericString());
System.out.println(java.lang.Class.class.toGenericString());
System.out.println(java.util.Collection.class.toGenericString());
System.out.println(java.util.HashMap.class.toGenericString());
// Interface
System.out.println(java.lang.Runnable.class.toGenericString());
// Enum
System.out.println(java.lang.Thread.State.class.toGenericString());
// Exception
System.out.println(java.lang.NullPointerException.class.toGenericString());
// Error
System.out.println(java.lang.ClassFormatError.class.toGenericString());
// Annonation
System.out.println(java.lang.Override.class.toGenericString());
```

♯ Output

```text
int
double
void
public class java.lang.Object
public final class java.lang.Class<T>
public abstract interface java.util.Collection<E>
public class java.util.HashMap<K,V>
public abstract interface java.lang.Runnable
public static final enum java.lang.Thread$State
public class java.lang.NullPointerException
public class java.lang.ClassFormatError
public abstract @interface java.lang.Override
```

------
