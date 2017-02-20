import java.util.Scanner;

/**
 * 
 * @author Neto
 *
 */
public class Idade {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual sua idade: ");
		idade = leitor.nextInt();
		System.out.println("Seu nome: ");
		nome = leitor.nextLine();

	}

}
