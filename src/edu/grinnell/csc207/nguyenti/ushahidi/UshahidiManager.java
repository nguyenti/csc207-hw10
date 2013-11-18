package edu.grinnell.csc207.nguyenti.ushahidi;

import java.util.Comparator;

import edu.grinnell.glimmer.ushahidi.UshahidiClient;
import edu.grinnell.glimmer.ushahidi.UshahidiIncident;
import edu.grinnell.glimmer.ushahidi.UshahidiWebClient;

/*
 * To do:
 * 	create UI
 * 	create comparators
 * 	
 */

public class UshahidiManager {
    
    //FIELDS
    DoublyLinkedList<UshahidiIncident> ushahidiList;
    
    
    //CONSTRUCTOR
    public UshahidiManager(){
	this.ushahidiList = new DoublyLinkedList<UshahidiIncident>();
    }
    
    
    //METHODS
    
   /**
    * Read the incidents of a UshahidiClient into a DoublyLinkedList
    * @param webclient
    * @throws Exception
    */
    public void readIncidents(UshahidiClient client) throws Exception {
	while (client.hasMoreIncidents()) {
	    this.ushahidiList.append(client.nextIncident());
	} // while
    }
    
    /**
     * Get the ten highest-priority incidents
     * @param comp
     * @return
     */
    public static DoublyLinkedList<UshahidiIncident> getTen(Comparator comp){
	DoublyLinkedList<UshahidiIncident> list = new DoublyLinkedList<UshahidiIncident>();
	
	return null;
    }
    
    //Optional stuff?
    
}
