The default hashCode() inherited from Object is the Object's hash code, which is the Object's memory address in hexadecimal.
The default equals() method inherited from Object compares two objects for equality using the identity operator (==).
    * for primitives that's fine
    * for Objects it compare whether the Object reference is equal

The equals() algorith must be at least as precise in defining what "meaningsfully equivalent" means as the hastCode() method is.