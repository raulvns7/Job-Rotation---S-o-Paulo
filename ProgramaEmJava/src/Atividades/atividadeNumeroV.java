package Atividades;

import javax.swing.JOptionPane;

public class atividadeNumeroV {

	public static void main(String[] args) {
		 
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
		
		 String fraseInvertida = new StringBuilder(frase).reverse().toString();
		 
		    System.out.println(fraseInvertida);

		}

}