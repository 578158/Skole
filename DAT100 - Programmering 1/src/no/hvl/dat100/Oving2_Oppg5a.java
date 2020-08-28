package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oving2_Oppg5a {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));

		if ((a > b) && (b > c))
			System.out.println("Tallende i stigende rekkefølge er: " + c + ", " + b + ", " + a);
		if ((a > c) && (c > b))
			System.out.println("Tallende i stigende rekkefølge er: " + b + ", " + c + ", " + a);
		if ((b > a) && (a > c))
			System.out.println("Tallende i stigende rekkefølge er: " + c + ", " + a + ", " + b);
		if ((b > c) && (c > a))
			System.out.println("Tallende i stigende rekkefølge er: " + a + ", " + c + ", " + b);
		if ((c > b) && (b > a))
			System.out.println("Tallende i stigende rekkefølge er: " + a + ", " + b + ", " + c);
		if ((c > a) && (a > b))
			System.out.println("Tallende i stigende rekkefølge er: " + b + ", " + a + ", " + c);

	}

}