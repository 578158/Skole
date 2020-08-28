package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oving2_Oppg1 {

	public static void main(String[] args) {
		
		int amount = Integer.parseInt(showInputDialog("Beløp"));
		int payed = Integer.parseInt(showInputDialog("Betalt"));
		if( payed > amount) {
			int remainder = payed - amount;
		
			showMessageDialog(null, "Tilbake: " +  remainder/10 + " * 10kr, " + remainder%10 + " * 1kr" );
		}
		else
			showMessageDialog(null, "Hele beløpet er ikke betalt");
	}

}
