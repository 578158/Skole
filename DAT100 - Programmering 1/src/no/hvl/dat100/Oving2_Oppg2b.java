package no.hvl.dat100;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Oving2_Oppg2b {

	public static void main(String[] args) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Radius til en kule"));
		double volume = Math.pow(radius, 3);
		volume *= (4.0 / 3.0) * Math.PI;
		System.out.println("Volumet til en kule med radius " + radius + " er " + volume);

	}

}
