/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans.Events;

import Commandes.Commandes;
import java.time.LocalDate;

/**
 *
 * @author student
 */
public class InstockEvent extends SearchFoundEvent {
    
    private LocalDate date;
    
    public InstockEvent(Commandes commande, boolean disponnibilit√©, LocalDate date){
        super(commande,disponnibilit√©);
        setDate(date);
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
