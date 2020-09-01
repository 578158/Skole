package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppg6 {

	static double fakultet(double n) {
		if (n > 1) {
			n *= fakultet(n - 1);
		}
		return n;
	}
	
	public static void main(String[] args) {
		double n = Double
				.parseDouble(JOptionPane.showInputDialog("Skriv inn et heltall \n(Kan ikke være større enn 170)"));
		if (n > 170) //Dette er fordi double kan ikke håndtere tall større enn 170!
			JOptionPane.showMessageDialog(null, "Kan ikke håndtere tall større enn 170");
		else {
			double fak = fakultet(n);

			JOptionPane.showMessageDialog(null, n + "! = " + fak);
		}

	}

}
