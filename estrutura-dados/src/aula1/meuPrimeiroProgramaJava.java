/**
 * 
 */
package aula1;

import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Locale;

/**
 * @author Usu√°rio
 *
 */
public class meuPrimeiroProgramaJava { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Sauda√ß√£o ao usu√°rio
		System.out.println("Ol· amigo!\nQual È o seu nome?"); 
		
		// Ler o nome
		Scanner in = new Scanner(System.in); 
		String nome = in.nextLine();
		
		// Sauda√ß√£o espec√≠fica para o √∫ltimo nome lido..
		System.out.printf("Ol√° %s", nome);
		
		// Perguntar a idade
		System.out.println("%s, qual È a sua idade?");
		
		// Ler idade
		Integer idade = in.nextInt();
		
		System.out.printf("%d! Puxa! Como vocÍ È jovem!", idade);
	}

}
