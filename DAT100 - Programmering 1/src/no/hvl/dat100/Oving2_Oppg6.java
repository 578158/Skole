package no.hvl.dat100;

import javax.swing.JOptionPane;


public class Oving2_Oppg6 {
	

	public static void main(String[] args) {
		final double TRINN4_MIN = 999551.0;
		final double TRINN3_MIN = 636751.0;
		final double TRINN2_MIN = 254501.0;
		final double TRINN1_MIN = 180801.0;
		
		final double TRINN4_PERCENT = 0.162;
		final double TRINN3_PERCENT = 0.132;
		final double TRINN2_PERCENT = 0.042;
		final double TRINN1_PERCENT = 0.019;
		
		
		Double salary = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn din bruttoinntekt: "));
		Double salaryMath = salary;
		
		Double trinn4 = 0.0;
		Double trinn3 = 0.0;
		Double trinn2 = 0.0;
		Double trinn1 = 0.0;
		
		if (salaryMath > TRINN4_MIN) {
			trinn4 = salaryMath - TRINN4_MIN;
			salaryMath -= trinn4;
			trinn4 *= TRINN4_PERCENT;
		}
		if (salaryMath > TRINN3_MIN) {
			trinn3 = salaryMath - TRINN3_MIN;
			salaryMath -= trinn3;
			trinn3 *= TRINN3_PERCENT;
		}
		if (salaryMath > TRINN2_MIN) {
			trinn2 = salaryMath - TRINN2_MIN;
			salaryMath -= trinn2;
			trinn2 *= TRINN2_PERCENT;
		}
		if (salaryMath > TRINN1_MIN) {
			trinn1 = salaryMath - TRINN1_MIN;
			salaryMath -= trinn1;
			trinn1 *= TRINN1_PERCENT;
		}
		
		System.out.println("Skatten du skal betale basert på " + salary + "kr");
		System.out.println("Trinn 4: " + trinn4 + "kr");
		System.out.println("Trinn 3: " + trinn3 + "kr");
		System.out.println("Trinn 2: " + trinn2 + "kr");
		System.out.println("Trinn 1: " + trinn1 + "kr");
		System.out.println("Du skal betale totalt " + (trinn4 + trinn3+ trinn2 + trinn1) + "kr i skatt");

	}

}
