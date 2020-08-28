package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oving2_Oppg4 {

	public static void main(String[] args) {
		String s1 = "Brukernavn";
		String s2 = "Passord";
		String username = JOptionPane.showInputDialog("Skriv inn brukernvn: ");
		
		if (s1.equals(username)) {
			String password = JOptionPane.showInputDialog("Skriv inn passord: ");
			if (s2.equals(password)) System.out.println("Brukernavn og passord er riktig");
			else System.out.println("Brukernavn riktig \nPassord feil");
		}
		else System.out.println("Brukernavn feil");
	}
	

}