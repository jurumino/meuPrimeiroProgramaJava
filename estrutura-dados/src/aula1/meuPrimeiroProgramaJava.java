/**
 * 
 */
package aula1;

import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Locale;

/**
 * @author Usu�rio
 *
 */
public class meuPrimeiroProgramaJava { //Classe que contem o m�todo principal

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Esse � o metodo principal
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in); // Ler uma string do console usando a biblioteca Scanner
		String nome = in.nextLine();
		System.out.printf("Ol� %s", nome);
		in.close();
	}

}
