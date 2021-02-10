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
public class meuPrimeiroProgramaJava { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Saudação ao usuário
		System.out.println("Olá amigo!\nQual é o seu nome?"); 
		
		// Ler o nome
		Scanner in = new Scanner(System.in); 
		String nome = in.nextLine();
		
		// Saudação específica para o último nome lido..
		System.out.printf("Olá %s", nome);
		
		// Fechando o in
		in.close();
		
		// Nota: Implementar leitura de idade e exibi-la.
	}

}
