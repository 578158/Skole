package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class Oving2_Oppg2a {

	public static void main(String[] args) {

		double radius = Double.parseDouble(showInputDialog("Radius til en kule"));
		double volume = pow(radius, 3);
		volume *= (4.0 / 3.0) * Math.PI;
		System.out.println(volume);

	}

}
