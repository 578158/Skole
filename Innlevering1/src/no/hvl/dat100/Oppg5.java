package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppg5 {

	public static void main(String[] args) {
		for (int i= 1;i <= 10; i++) {
			boolean check = true; 
			while (check) {
				int poeng = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange poeng fikk du?"));
				check = false;
				if 		(poeng <= 100 && poeng >= 90)	System.out.println("A");
				else if (poeng <= 89 && poeng >= 80) 	System.out.println("B");
				else if (poeng <= 79 && poeng >= 60) 	System.out.println("C");
				else if (poeng <= 59 && poeng >= 50)	System.out.println("D");
				else if (poeng <= 49 && poeng >= 40)	System.out.println("E");
				else if (poeng <= 39 && poeng >= 0)		System.out.println("F");
				else {
					JOptionPane.showMessageDialog(null, "Tallet utenfor rekkevidden (100-0)");
					check = true;
				}
			}
		}

	}

}
