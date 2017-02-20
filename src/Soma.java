import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		float num1 = 0,num2 = 0;//Inicializa as variaveis
		float media= 0;
		Scanner input = new Scanner(System.in);//crio um objeto da classe Scanner para ler o teclado
		System.out.println("Digite um fucking numero");//primeira variavel
		num1 = input.nextInt();//leio a primeira
		System.out.println("Digite o segundo numero: ");
		num2 = input.nextInt();
		
		media = (num1+num2)/2;//tira a media
		
		System.out.println("A media é: "+media);
		
		

	}

}
