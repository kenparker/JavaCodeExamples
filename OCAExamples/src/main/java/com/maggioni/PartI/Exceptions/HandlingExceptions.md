Handling Exceptions
===================

RunTimeExceptions
-----------------

* NumberFormatException: Thrown to indicate that the application attemped to convert a string to Nnumerix Types
* NumberFormatException is a child from IllegalArgumentException
* IllegalArgumentException is a RunTimeException
* RunTimeException -> IllegalArgumentException -> NumberFormatException
* RunTimeException -> IllegalArgumentException -> IllegalFormatException
* RunTimeException -> IllegalArgumentException -> InvalidParameterException

* RunTimeException -> IllegalStateException

* RunTimeException -> ArithmeticException
* RunTimeException -> NullPointerException
* RunTimeException -> IndexOutOfBoundExceptions

* RunTimeException -> NullPointerException      Thrown when an appl attemps to use null in case where an obj is required.
http://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html

Which of the following situations should provide exception handling code?
1. When accession data files
2. When verifying user inputs

It is considered bad programming practive to provide exception handling code for the following:
1. ArrayIndexOutOfBoundsExceptions
2. StackOverflowError
3. ClassCastingException


http://www.javamex.com/tutorials/exceptions/exceptions_throwing.shtml
http://rymden.nu/exceptions.html
http://www.explain-java.com/explain-most-common-exceptions-and-errors-in-java-examples/


