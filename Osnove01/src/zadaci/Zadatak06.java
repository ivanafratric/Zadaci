package zadaci;

import javax.swing.JOptionPane;

public class Zadatak06 {

	public static void main(String[] args) {

		//Write a Java program to print the sum (addition), 
		//multiply, subtract, divide and remainder of two numbers
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		System.out.println("Zbroj = " + (i+j));
		System.out.println("Razlika = " + (i-j));
		System.out.println("Umnožak = " + (i*j));
		System.out.println("Produkt = " + (i/j));
		System.out.println("Modulo = " + (i%j));
		
	}

}
