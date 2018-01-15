# Java White Paper Buzzword

1.  **Simple**

> We wanted to build a system that could be programmed easily without a lot of
> esoteric training and which leveraged today's standard practice. So even
> though we found that C++ was unsuitable, we designed Java as closely to C++ as
> possible in order to make the system more comprehensible. Java omits many
> rarely used, poorly understood, confusing features of C++ that, in our
> experience, bring more grief than benefit.

> Another aspect of being simple is being small. One of the goals of Java is to
> enable the construction of software that can run stand-alone on small
> machines. The size of the basic interpreter and class support is about 40K;
> the basic standard libraries and thread support (essentially a self-contained
> microkernel) add another 175K.

2.  **Object-Oriented**

> Simply stated, object-oriented design is a programming technique that focuses
> on the data (= objects) and on the interfaces to that object. To make an
> analogy with carpentry, an "object-oriented" carpenter would be mostly
> concerned with the chair he is building, and secondarily with the tools used
> to make it; a "non-object-oriented" carpenter would think primarily of his
> tools. The object-oriented facilities of Java are essentially those of C++.

3.  **Distributed**

> Java has an extensive library of routines for coping with TCP/IP protocols
> like HTTP and FTP. Java applications can open and access objects across the
> Net via URLs with the same ease as when accessing a local file system.

4.  **Robust**

> Java is intended for writing programs that must be reliable in a variety of
> ways. Java puts a lot of emphasis on early checking for possible problems,
> later dynamic (runtime) checking, and eliminating situations that are
> error-prone... The single biggest difference between Java and C/C++ is that
> Java has a pointer model that eliminates the possibility of overwriting memory
> and corrupting data.

5.  **Secure**

> Java is intended to be used in networked/distributed environments. Toward that
> end, a lot of emphasis has been placed on security. Java enables the
> construction of virus-free, tamper-free systems.

6.  **Architecture-Neutral**

> The compiler generates an architecture-neutral object file format—the compiled
> code is executable on many processors, given the presence of the Java runtime
> system. The Java compiler does this by generating bytecode instructions which
> have nothing to do with a particular computer architecture. Rather, they are
> designed to be both easy to interpret on any machine and easily translated
> into native machine code on the fly.

7.  **Portable**

> Unlike C and C++, there are no "implementation-dependent" aspects of the
> specification. The sizes of the primitive data types are specified, as is the
> behavior of arithmetic on them.

8.  **Interpreted**

> The Java interpreter can execute Java bytecodes directly on any machine to
> which the interpreter has been ported. Since linking is a more incremental and
> lightweight process, the development process can be much more rapid and
> exploratory.

9.  **High-Performance**

> While the performance of interpreted bytecodes is usually more than adequate,
> there are situations where higher performance is required. The bytecodes can
> be translated on the fly (at runtime) into machine code for the particular CPU
> the application is running on.

10. **Multithreaded**

> [The] benefits of multithreading are better interactive responsiveness and
> real-time behavior.

11. **Dynamic**

> In a number of ways, Java is a more dynamic language than C or C++. It was
> designed to adapt to an evolving environment. Libraries can freely add new
> methods and instance variables without any effect on their clients. In Java,
> finding out runtime type information is straightforward.
