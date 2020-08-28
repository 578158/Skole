package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Innlevering1_Oppg6 {
	
	static int fakultet(int n) {
		if (n > 1) {
			n *= fakultet(n-1);
		}
		return n;
	}

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Skirv inn et heltall"));
		n = fakultet(n);
		
		JOptionPane.showMessageDialog(null, "n! = " + n);

	}

}
