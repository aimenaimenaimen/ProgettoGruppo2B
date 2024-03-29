/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo.demo.lunedi;
import java.util.ArrayList;

/**
 *  Classe che si occupa della management dei giocatori , permette di inserire un giocatore nella lista , rimuoverlo , visualizzarlo e visualizzare la lista.
 * @author Aimen
 */
public class GestioneGiocatori {
    
    protected ArrayList<Partecipante> list;
	
    
        /**
         * Costruttore che mi inizializza un array / vettore di Partecipanti.
         */
	public GestioneGiocatori() {
		super();
		this.list = new ArrayList<Partecipante>();
	}
	
        /**
         * 
         * Metodo per visualizzare la lista
         * @return list;
         */
	public ArrayList<Partecipante> getList() {
		return list;
	}
        /**
         * Metodo che permette di impostare un partecipante dentro la lista.
         * @param list 
         */
	public void setList(ArrayList<Partecipante> list) {
		this.list = list;
	}
    /**
     * Metodo che permette di aggiungere un partecipante all'array
     * @param p 
     */
    public void addParticepant(Partecipante p) {
		list.add(p);
	}
    /**
     * Metodo che permette di visualizzare la lista dei partecipanti
     * @return "InserimentoGiocatori{" + "list=" + list + '}';
     */
    @Override
    public String toString() {
        return "InserimentoGiocatori{" + "list=" + list + '}';
    }
        
	
	

}
    
    
    
    
    
    

    
