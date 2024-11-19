package com.labs.java.core.oops;

/**
 * 1. Add methods are abstract by default.
 * 2. Can't have instance variables.
 * 3. Can't have constructors.
 * 4. Can have constants. By default all constants are public, static and final.
 */
public interface PreClosable extends Closeable, Cloneable {
    public default void preClosable() {
        System.out.println("Pre-closing Default Impl");
    }
}
