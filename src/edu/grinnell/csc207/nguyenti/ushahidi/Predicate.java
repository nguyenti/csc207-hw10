package edu.grinnell.csc207.nguyenti.ushahidi;

public interface Predicate<T> {
    /**
     * From hw7
     * Determine if a value meets the predicate.
     */
    boolean test(T val);
} // Predicate<T>