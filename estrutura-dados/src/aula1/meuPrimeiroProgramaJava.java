/**
 * 
 */
package aula1;

import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Locale;

/**
 * @author Usuário
 *
 */
public class meuPrimeiroProgramaJava { //Classe que contem o método principal

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Esse é o metodo principal
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in); // Ler uma string do console usando a biblioteca Scanner
		String nome = in.nextLine();
		System.out.printf("Olá %s", nome);
		in.close();
	}

}
