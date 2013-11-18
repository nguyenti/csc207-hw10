package edu.grinnell.csc207.nguyenti.ushahidi;

import java.util.Comparator;

public class UshahidiComparators implements Comparable {


    @Override
    public int compareTo(Object o) {
	return this.compareTo(o);
    }
    
    
    public int compareToDec(Object o) {
	return -1 * this.compareTo(o);
    }
    
    
}
