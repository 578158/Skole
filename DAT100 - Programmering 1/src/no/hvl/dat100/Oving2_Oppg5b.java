package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oving2_Oppg5b {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));
		int i1 = 0, i2 = 0, i3 = 0;
		
		if ((a > b) && (a > c)) {
			i1 = a;
			if (b > c) {
				i2 = b;
				i3 = c;
			}
			else {
				i2 = c;
				i3 = b;
			}
		}
		else if ((b > a) && (b > c)) {
			i1 = b;
			if (a > c) {
				i2 = a;
				i3 = c;
			}
			else {
				i2 = c;
				i3 = a;
			}
		}
		else if ((c > a) && (c > b)) {
			i1 = c;
			if (a > b) {
				i2 = a;
				i3 = b;
			}
			else {
				i2 = b;
				i3 = a;
			}
		}
		System.out.println("Tallende i stigende rekkefølge er: " + i3 + ", " + i2 + ", " + i1);
	}

}