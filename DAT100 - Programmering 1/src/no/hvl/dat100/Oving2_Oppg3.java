package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oving2_Oppg3 {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn verdi a"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn verdi b"));
		
		if (b != 0) JOptionPane.showMessageDialog(null, a + " / " + b + " = " + a/b);
		else JOptionPane.showMessageDialog(null, "b = 0 og vi kan da ikke dele a på b");
	}

}
