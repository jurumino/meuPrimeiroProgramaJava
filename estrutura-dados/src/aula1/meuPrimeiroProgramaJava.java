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
public class meuPrimeiroProgramaJava { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Sauda��o ao usu�rio
		System.out.println("Ol� amigo!\nQual � o seu nome?"); 
		
		// Ler o nome
		Scanner in = new Scanner(System.in); 
		String nome = in.nextLine();
		
		// Sauda��o espec�fica com o nome
		System.out.printf("Ol� %s", nome);
		
		// Fechando o in
		in.close();
	}

}
