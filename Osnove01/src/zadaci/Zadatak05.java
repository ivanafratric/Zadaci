package zadaci;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {

		//Write a Java program that takes two numbers as input 
		//and display the product of two numbers
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		System.out.println(i+j);
		
	}

}
