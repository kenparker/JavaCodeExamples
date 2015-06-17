Overrding Rules
===============

Argument list and return type
-----------------------------
1. The argument List must exactly match that of the overridden method. It it does not match, you do not override.
2. The return type must be the same as, or a subtype of (covariant return), the return type declared 
in the original overidden method in the superclass.
Access level
------------
3. The access level can't be more restrictive than that of the overridden method.
4. The access level can be less restrictive than that of the overridden method.
5. Instance methods can be overidden <b>only</b> if they are inherited by the subclass.
5.1. A subclass within the same package as the instance's superclass can override any superclass method that is not market
PRIVATE or FINAL.
5.2. A subclass in a different package can override only those nonFINAL methods marked PUBLIC or PROTECTED
Exceptions
----------
6. The overriding method can throw any unchecked (runtime) exception, regardless of whether the overridden method declares the exception.
7. The overriding method must not throw checked exceptions that are new or broader that those declared by the overridden method.
    this means the overriding method cannot throw same exceptions or subclasses but not superclasses
8. The overriding method CAN throw narrower or fewer exceptions

9. STATIC methods cannot be overridden.


