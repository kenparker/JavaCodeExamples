Handling Exceptions
===================

RunTimeExceptions
-----------------

* NumberFormatException: Thrown to indicate that the application attemped to convert a string to Nnumerix Types
* NumberFormatException is a child from IllegalArgumentException
* IllegalArgumentException is a RunTimeException
* RunTimeException -> IllegalArgumentException  Thrown to indicate that a method has been passed an illegal or inappropriate argument.
* RunTimeException -> IllegalArgumentException -> NumberFormatException
* RunTimeException -> IllegalArgumentException -> IllegalFormatException
* RunTimeException -> IllegalArgumentException -> InvalidParameterException

* RunTimeException -> IllegalStateException

* RunTimeException -> ArithmeticException   ganzzahlige Division durch 0
* RunTimeException -> NullPointerException
* RunTimeException -> NegativeArraySizeException
* RunTimeException -> ArrayStoreException       Thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects.
* RunTimeException -> IndexOutOfBoundException
* RunTimeException -> IndexOutOfBoundException -> ArrayIndexOutOfBoundsException
* RunTimeException -> IndexOutOfBoundException -> StringIndexOutOfBoundsException

* RunTimeException -> NullPointerException      Thrown when an appl attemps to use null in case where an obj is required.
http://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html

Which of the following situations should provide exception handling code?
1. When accession data files
2. When verifying user inputs

It is considered bad programming practive to provide exception handling code for the following:
1. ArrayIndexOutOfBoundsException
2. StackOverflowError
3. ClassCastingException


* Error -> LinkageError -> ExceptionInInitializerError is thrown to indicate that an exception occurred during evaluation of a static initializer or the initializer for a static variable
* Error -> AssertionError http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_06_006.htm#mjf23c8575d07f646967546e7dff4684f4


http://www.javamex.com/tutorials/exceptions/exceptions_throwing.shtml
http://rymden.nu/exceptions.html
http://www.explain-java.com/explain-most-common-exceptions-and-errors-in-java-examples/
http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_06_003.htm#mj04684717a910967f74a97845256fb5cd




