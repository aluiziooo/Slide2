import java.util.Scanner;

public class DeterminarIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nas, atual, idade;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Que ano voc� nasceu: ");
		nas = leitor.nextInt();
		System.out.println("Qual o ano atual? ");
		atual = leitor.nextInt();
		idade = nas - atual;

		System.out.println("Voc� tem " + idade + " de Idade nesse ano");

	}

}
